package com.tellh.nolistadapter.adapter;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.tellh.nolistadapter.DataBean;
import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;
import com.tellh.nolistadapter.viewbinder.sub.ErrorRecyclerViewBinder;

import java.util.ArrayList;
import java.util.List;


/**
 * Created by tlh on 2016/8/4.
 *
 */
public class HeaderAndFooterAdapterWrapper extends RecyclerViewAdapter implements IListAdapter {

    private final RecyclerViewAdapter mAdapter;
    private SparseArrayCompat<RecyclerViewBinder> headerBinderPool;
    private SparseArrayCompat<RecyclerViewBinder> footerBinderPool;
    private List<RecyclerViewBinder> headerBinderList;
    private List<RecyclerViewBinder> footerBinderList;

    public HeaderAndFooterAdapterWrapper(RecyclerViewAdapter adapter) {
        super(adapter.getDisplayList());
        mAdapter = adapter;
        this.errorViewBinder = mAdapter.errorViewBinder;
    }


    private boolean isHeaderViewPos(int position) {
        return position < getHeadersCount();
    }

    private boolean isFooterViewPos(int position) {
        return position >= getHeadersCount() + mAdapter.getItemCount();
    }

    public int getHeadersCount() {
        return headerBinderList == null ? 0 : headerBinderList.size();
    }

    public int getFootersCount() {
        return footerBinderList == null ? 0 : footerBinderList.size();
    }

    public void addHeader(RecyclerViewBinder headerBinder) {
        if (headerBinderPool == null) {
            headerBinderPool = new SparseArrayCompat<>();
            headerBinderList = new ArrayList<>();
        }
        headerBinderPool.put(headerBinder.getItemLayoutId(this), headerBinder);
        headerBinderList.add(headerBinder);
    }

    public void addFooter(RecyclerViewBinder footerBinder) {
        if (footerBinderPool == null) {
            footerBinderPool = new SparseArrayCompat<>();
            footerBinderList = new ArrayList<>();
        }
        footerBinderPool.put(footerBinder.getItemLayoutId(this), footerBinder);
        footerBinderList.add(footerBinder);
    }

    @Override
    public int getItemViewType(int position) {
        if (errorViewBinder != null && errorViewBinder.showNow)
            return mAdapter.getItemViewType(position);
        if (mAdapter.getDisplayList().size() == 0)
            return mAdapter.getItemViewType(position);
        if (isHeaderViewPos(position)) {
            return headerBinderList.get(position).getItemLayoutId(this);
        } else if (isFooterViewPos(position)) {
            int index = position - getHeadersCount() - mAdapter.getItemCount();
            return footerBinderList.get(index)
                    .getItemLayoutId(this);
        }
        return mAdapter.getItemViewType(position - getHeadersCount());
    }

    @Override
    public void swap(int fromPosition, int toPosition) {
        if (isHeaderViewPos(fromPosition) || isHeaderViewPos(toPosition) || isFooterViewPos(fromPosition) || isFooterViewPos(toPosition))
            return;
        mAdapter.swap(fromPosition - getHeadersCount(), toPosition - getHeadersCount());
    }

    @Override
    public void delete(int pos) {
        if (isHeaderViewPos(pos) || isFooterViewPos(pos))
            return;
        mAdapter.delete(pos - getHeadersCount());
    }

    @Override
    public void add(int pos, DataBean item) {
        if (isHeaderViewPos(pos) || isFooterViewPos(pos))
            return;
        mAdapter.add(pos - getHeadersCount(), item);
    }

    private RecyclerView.ViewHolder getHeaderViewHolder(int viewType, Context context, ViewGroup parent) {
        if (headerBinderPool == null)
            return null;
        RecyclerViewBinder viewBinder = headerBinderPool.get(viewType);
        if (viewBinder == null)
            return null;
        return viewBinder.provideViewHolder(LayoutInflater.from(context).inflate(viewBinder.getItemLayoutId(this), parent, false));
    }

    private RecyclerView.ViewHolder getFooterViewHolder(int viewType, Context context, ViewGroup parent) {
        if (footerBinderPool == null)
            return null;
        RecyclerViewBinder viewBinder = footerBinderPool.get(viewType);
        if (viewBinder == null)
            return null;
        return viewBinder.provideViewHolder(LayoutInflater.from(context).inflate(viewBinder.getItemLayoutId(this), parent, false));
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (errorViewBinder != null && errorViewBinder.showNow) {
            return mAdapter.onCreateViewHolder(parent, viewType);
        }
        if (mAdapter.getDisplayList().size() == 0)
            return mAdapter.onCreateViewHolder(parent, viewType);
        Context context = parent.getContext();
        RecyclerView.ViewHolder viewHolder;
        viewHolder = getHeaderViewHolder(viewType, context, parent);
        if (viewHolder != null)
            return viewHolder;
        viewHolder = getFooterViewHolder(viewType, context, parent);
        if (viewHolder != null)
            return viewHolder;
        return mAdapter.onCreateViewHolder(parent, viewType);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (errorViewBinder != null && errorViewBinder.showNow) {
            mAdapter.onBindViewHolder(holder, position);
            return;
        }
        if (mAdapter.getDisplayList().size() == 0) {
            mAdapter.onBindViewHolder(holder, position);
            return;
        }
        if (isHeaderViewPos(position)) {
            headerBinderList.get(position).bindView(this, holder, position, null);
            return;
        }
        if (isFooterViewPos(position)) {
            int index = position - getHeadersCount() - mAdapter.getItemCount();
            footerBinderList.get(index).bindView(this, holder, index, null);
            return;
        }
        mAdapter.onBindViewHolder(holder, position - getHeadersCount());
    }

    @Override
    public int getItemCount() {
        if (errorViewBinder != null && errorViewBinder.showNow)
            return mAdapter.getItemCount();
        if (mAdapter.getDisplayList().size() == 0)
            return mAdapter.getItemCount();
        return mAdapter.getItemCount() + getHeadersCount() + getFootersCount();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        mAdapter.onAttachedToRecyclerView(recyclerView);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            final GridLayoutManager manager = (GridLayoutManager) layoutManager;
            manager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int position) {
                    return (isHeaderViewPos(position) || isFooterViewPos(position)) ?
                            manager.getSpanCount() : 1;
                }
            });
            manager.setSpanCount(manager.getSpanCount());
        }
    }

    @Override
    public void setEmptyViewBinder(RecyclerViewBinder emptyViewBinder) {
        mAdapter.setEmptyViewBinder(emptyViewBinder);
    }

    @Override
    public void setErrorViewBinder(ErrorRecyclerViewBinder errorViewBinder) {
        mAdapter.setErrorViewBinder(errorViewBinder);
        this.errorViewBinder = mAdapter.errorViewBinder;
    }

    @Override
    public void showErrorView(RecyclerView recyclerView) {
        mAdapter.showErrorView(recyclerView);
    }

    @Override
    public void hideErrorView(RecyclerView recyclerView) {
        mAdapter.hideErrorView(recyclerView);
    }

    @Override
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        mAdapter.onViewAttachedToWindow(holder);
        int position = holder.getLayoutPosition();
        if (isHeaderViewPos(position) || isFooterViewPos(position)) {
            ViewGroup.LayoutParams lp = holder.itemView.getLayoutParams();
            if (lp != null
                    && lp instanceof StaggeredGridLayoutManager.LayoutParams) {
                StaggeredGridLayoutManager.LayoutParams p =
                        (StaggeredGridLayoutManager.LayoutParams) lp;
                p.setFullSpan(true);
            }
        }
    }


}
