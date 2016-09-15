package com.tellh.nolistadapter.adapter;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;

/**
 * Created by tlh on 2016/2/18.
 *
 */
public class FooterLoadMoreAdapterWrapper extends HeaderAndFooterAdapterWrapper {
    private int curPage = 1;

    public enum UpdateType {
        REFRESH, LOAD_MORE
    }

    public enum FooterState {
        PULL_TO_LOAD_MORE,
        LOADING,
        NO_MORE,
    }

    private FooterState mFooterStatus = FooterState.PULL_TO_LOAD_MORE;

    public FooterState getFooterStatus() {
        return mFooterStatus;
    }

    public FooterLoadMoreAdapterWrapper(RecyclerViewAdapter adapter, RecyclerView recyclerView, final OnReachFooterListener listener) {
        super(adapter);
        setOnReachFooterListener(recyclerView, listener);
    }

    public void setOnReachFooterListener(RecyclerView recyclerView, final OnReachFooterListener listener) {
        if (recyclerView == null || listener == null)
            return;
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if (!isReachBottom(recyclerView, newState) || getDisplayList().size() == 0 || (errorViewBinder != null && errorViewBinder.showNow))
                    return;
                if (mFooterStatus != FooterState.LOADING
                        && mFooterStatus != FooterState.NO_MORE) {
                    setFooterStatus(FooterState.LOADING);
                    listener.onToLoadMore(curPage);
                }
            }
        });
    }

    public void setFooterStatus(FooterState status) {
        mFooterStatus = status;
        notifyDataSetChanged();
    }

    public boolean isReachBottom(RecyclerView recyclerView, int newState) {
        return recyclerView != null && newState == RecyclerView.SCROLL_STATE_IDLE
                && ((LinearLayoutManager) recyclerView.getLayoutManager()).findLastCompletelyVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1;
    }

    public interface OnReachFooterListener {
        void onToLoadMore(int curPage);
    }

    public void OnGetData(List data, UpdateType updateType) {
        if (updateType == UpdateType.REFRESH) {
            refresh(data);
            curPage = 1;
            setFooterStatus(FooterLoadMoreAdapterWrapper.FooterState.PULL_TO_LOAD_MORE);
        } else {
            if (data.isEmpty()) {
                setFooterStatus(FooterLoadMoreAdapterWrapper.FooterState.NO_MORE);
                return;
            }
            addAll(data);
            curPage++;
            setFooterStatus(FooterLoadMoreAdapterWrapper.FooterState.PULL_TO_LOAD_MORE);
        }
    }

    public int getCurPage() {
        return curPage;
    }
}
