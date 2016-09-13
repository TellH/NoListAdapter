package tellh.com.nolistadapter.adapter;

import android.content.Context;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tellh.com.nolistadapter.viewbinder.ViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

/**
 * Created by tlh on 2016/8/4.
 */
public class HeaderAndFooterAdapterWrapper extends RecyclerViewAdapter implements IListAdapter {

    private final RecyclerViewAdapter mAdapter;
    private SparseArrayCompat<ViewBinder> headerBinderPool;
    private SparseArrayCompat<ViewBinder> footerBinderPool;
    private List<ViewBinder> headerBinderList;
    private List<ViewBinder> footerBinderList;

    public HeaderAndFooterAdapterWrapper(RecyclerViewAdapter adapter) {
        super(adapter.getDisplayList());
        mAdapter = adapter;
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

    public void addHeader(ViewBinder headerBinder) {
        if (headerBinderPool == null) {
            headerBinderPool = new SparseArrayCompat<>();
            headerBinderList = new ArrayList<>();
        }
        headerBinderPool.put(headerBinder.getItemLayoutId(this), headerBinder);
        headerBinderList.add(headerBinder);
    }

    public void addFooter(ViewBinder footerBinder) {
        if (footerBinderPool == null) {
            footerBinderPool = new SparseArrayCompat<>();
            footerBinderList = new ArrayList<>();
        }
        footerBinderPool.put(footerBinder.getItemLayoutId(this), footerBinder);
        footerBinderList.add(footerBinder);
    }

    @Override
    public int getItemViewType(int position) {
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
    public void add(int pos, ViewBinderProvider item) {
        if (isHeaderViewPos(pos) || isFooterViewPos(pos))
            return;
        mAdapter.add(pos - getHeadersCount(), item);
    }

    private RecyclerView.ViewHolder getHeaderViewHolder(int viewType, Context context, ViewGroup parent) {
        if (headerBinderPool == null)
            return null;
        ViewBinder viewBinder = headerBinderPool.get(viewType);
        if (viewBinder == null)
            return null;
        return viewBinder.provideViewHolder(LayoutInflater.from(context).inflate(viewBinder.getItemLayoutId(this), parent, false));
    }

    private RecyclerView.ViewHolder getFooterViewHolder(int viewType, Context context, ViewGroup parent) {
        if (footerBinderPool == null)
            return null;
        ViewBinder viewBinder = footerBinderPool.get(viewType);
        if (viewBinder == null)
            return null;
        return viewBinder.provideViewHolder(LayoutInflater.from(context).inflate(viewBinder.getItemLayoutId(this), parent, false));
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
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
            footerBinderList.get(index).bindView(this, holder, position, null);
            return;
        }
        mAdapter.onBindViewHolder(holder, position - getHeadersCount());
    }

    @Override
    public int getItemCount() {
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
    public void setEmptyViewBinder(ViewBinder emptyViewBinder) {
        mAdapter.setEmptyViewBinder(emptyViewBinder);
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
