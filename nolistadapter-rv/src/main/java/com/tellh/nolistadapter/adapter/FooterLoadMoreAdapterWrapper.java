package com.tellh.nolistadapter.adapter;

import android.support.annotation.IntDef;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/**
 * Created by tlh on 2016/2/18.
 *
 */
public class FooterLoadMoreAdapterWrapper extends HeaderAndFooterAdapterWrapper {
    private int curPage;
    //UpdateType
    public static final int REFRESH = 401;
    public static final int LOAD_MORE = 140;

    public static final int PULL_TO_LOAD_MORE = 501;
    public static final int LOADING = 323;
    public static final int NO_MORE = 313;

    @IntDef({REFRESH, LOAD_MORE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface UpdateType {
    }

    @IntDef({PULL_TO_LOAD_MORE, LOADING, NO_MORE})
    @Retention(RetentionPolicy.SOURCE)
    @interface FooterState {
    }

    @FooterState
    private int mFooterStatus = PULL_TO_LOAD_MORE;

    @FooterState
    public int getFooterStatus() {
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
                if (mFooterStatus != LOADING
                        && mFooterStatus != NO_MORE) {
                    setFooterStatus(LOADING);
                    listener.onToLoadMore(curPage);
                }
            }
        });
    }


    public void setFooterStatus(@FooterState int status) {
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

    public void OnGetData(List data, @UpdateType int updateType) {
        if (updateType == REFRESH) {
            refresh(data);
            curPage = 1;
            setFooterStatus(PULL_TO_LOAD_MORE);
        } else {
            if (data.isEmpty()) {
                setFooterStatus(NO_MORE);
                return;
            }
            addAll(data);
            curPage++;
            setFooterStatus(PULL_TO_LOAD_MORE);
        }
    }

    public int getCurPage() {
        return curPage;
    }
}
