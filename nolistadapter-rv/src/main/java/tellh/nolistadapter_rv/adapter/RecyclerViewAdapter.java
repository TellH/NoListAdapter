package tellh.nolistadapter_rv.adapter;

import android.support.annotation.LayoutRes;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tellh.nolistadapter_rv.adapter.FooterLoadMoreAdapterWrapper.OnReachFooterListener;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.EmptyRecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.ErrorRecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.FooterRecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.HeaderRecyclerViewBinder;
import tellh.nolistadapter_common.ViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> implements IListAdapter_RV {
    private static int SIZE_VIEW_BINDER_POOL = 10;
    private RecyclerViewBinder viewBinderCache;

    private RecyclerViewBinder emptyViewBinder;
    protected ErrorRecyclerViewBinder errorViewBinder;

    private SparseArrayCompat<RecyclerViewBinder> viewBinderPool;
    protected List<ViewBinderProvider> displayList;

    public RecyclerViewAdapter(List<ViewBinderProvider> displayList) {
        viewBinderPool = new SparseArrayCompat<>(SIZE_VIEW_BINDER_POOL);
        if (displayList == null)
            displayList = new ArrayList<>();
        this.displayList = displayList;
    }

    @Override
    public List<ViewBinderProvider> getDisplayList() {
        return displayList;
    }

    @Override
    public int getItemViewType(int position) {
        //error view
        if (errorViewBinder != null && errorViewBinder.showNow)
            return errorViewBinder.getItemLayoutId(this);
        //empty view
        if (displayList.size() == 0) {
            return emptyViewBinder != null ? emptyViewBinder.getItemLayoutId(this) : super.getItemViewType(position);
        }
        //normal view
        return displayList.get(position).getItemLayoutId(this);
    }


    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        RecyclerViewBinder viewBinder = getViewBinder(viewType);
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(viewBinder.getItemLayoutId(this), parent, false);
        return viewBinder.provideViewHolder(itemView);
    }

    private RecyclerViewBinder getViewBinder(int viewType) {
        //error view
        if (errorViewBinder != null && errorViewBinder.showNow && errorViewBinder.getItemLayoutId(this) == viewType)
            return errorViewBinder;
        //empty view
        if (displayList.size() == 0 && emptyViewBinder != null && viewType == emptyViewBinder.getItemLayoutId(this))
            return emptyViewBinder;
        //In most situation, item type in a list could be only one. So I cache this binder.
        RecyclerViewBinder viewBinder;
        if (viewBinderPool.size() == 1) {
            if (viewBinderCache == null)
                viewBinder = viewBinderCache = viewBinderPool.get(viewType);
            else viewBinder = viewBinderCache;
        } else {
            viewBinder = viewBinderPool.get(viewType);
        }
        return viewBinder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //error view
        if (errorViewBinder != null && errorViewBinder.showNow) {
            errorViewBinder.bindView(this, (RecyclerViewBinder.ViewHolder) holder, position, null);
            return;
        }
        //empty view
        if (displayList.size() == 0) {
            if (emptyViewBinder != null)
                emptyViewBinder.bindView(this, holder, position, null);
            return;
        }
        //normal view
        ViewBinderProvider viewBinderProvider = displayList.get(position);
        if (viewBinderCache != null) {
            viewBinderCache.bindView(this, holder, position, viewBinderProvider);
            return;
        }
        viewBinderProvider.provideViewBinder(this, viewBinderPool, position).bindView(this, holder, position, viewBinderProvider);
    }

    @Override
    public int getItemCount() {
        if (errorViewBinder != null && errorViewBinder.showNow)
            return 1;
        if (emptyViewBinder != null && displayList.size() == 0)
            return 1;
        return displayList == null ? 0 : displayList.size();
    }

    public RecyclerViewBinder findViewBinderFromPool(@LayoutRes int layoutId) {
        return viewBinderPool.get(layoutId);
    }

    public static void setViewBinderPoolInitSize(int size) {
        SIZE_VIEW_BINDER_POOL = size;
    }

    public void clearViewBinderCache() {
        viewBinderPool.clear();
    }

    @Override
    public void addAll(List<? extends ViewBinderProvider> list) {
        if (list == null)
            return;
        displayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void refresh(List<? extends ViewBinderProvider> list) {
        if (list == null)
            return;
        displayList.clear();
        displayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void add(int pos, ViewBinderProvider item) {
        displayList.add(pos, item);
        notifyItemInserted(pos);
    }

    @Override
    public void delete(int pos) {
        displayList.remove(pos);
        notifyItemRemoved(pos);
    }

    @Override
    public void swap(int fromPosition, int toPosition) {
        Collections.swap(displayList, fromPosition, toPosition);
        notifyItemMoved(fromPosition, toPosition);
    }

    @Override
    public void clear(RecyclerView recyclerView) {
        displayList.clear();
        notifyDataSetChanged();
        recyclerView.scrollToPosition(0);
    }

    @Override
    public void showErrorView(RecyclerView recyclerView) {
        if (errorViewBinder == null)
            return;
        errorViewBinder.showNow = true;
        notifyDataSetChanged();
        recyclerView.scrollToPosition(0);
    }

    @Override
    public void hideErrorView(RecyclerView recyclerView) {
        if (errorViewBinder == null)
            return;
        errorViewBinder.showNow = false;
        notifyDataSetChanged();
        recyclerView.scrollToPosition(0);
    }

    public void setEmptyViewBinder(RecyclerViewBinder emptyViewBinder) {
        this.emptyViewBinder = emptyViewBinder;
    }

    public void setErrorViewBinder(ErrorRecyclerViewBinder errorViewBinder) {
        this.errorViewBinder = errorViewBinder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private RecyclerViewAdapter adapter;

        private HeaderAndFooterAdapterWrapper headerAndFooterAdapterWrapper;

        public Builder() {
            adapter = new RecyclerViewAdapter(null);
        }

        public Builder displayList(List<? extends ViewBinderProvider> displayList) {
            List<ViewBinderProvider> adapterList = adapter.getDisplayList();
            for (ViewBinderProvider viewBinderProvider : displayList) {
                adapterList.add(viewBinderProvider);
            }
            return this;
        }

        public Builder addItemType(RecyclerViewBinder viewBinder) {
            adapter.viewBinderPool.put(viewBinder.getItemLayoutId(adapter), viewBinder);
            return this;
        }

        public Builder addHeader(HeaderRecyclerViewBinder viewBinder) {
            initHFAdapterWrapper();
            headerAndFooterAdapterWrapper.addHeader(viewBinder);
            return this;
        }

        public Builder addFooter(FooterRecyclerViewBinder viewBinder) {
            initHFAdapterWrapper();
            headerAndFooterAdapterWrapper.addFooter(viewBinder);
            return this;
        }

        public Builder setEmptyView(EmptyRecyclerViewBinder viewBinder) {
            adapter.setEmptyViewBinder(viewBinder);
            return this;
        }

        public Builder setErrorView(ErrorRecyclerViewBinder viewBinder) {
            adapter.setErrorViewBinder(viewBinder);
            return this;
        }

        //This load more footer should only be added once.
        public Builder setLoadMoreFooter(FooterRecyclerViewBinder viewBinder, RecyclerView recyclerView, final OnReachFooterListener listener) {
            FooterLoadMoreAdapterWrapper footerLoadMoreAdapterWrapper = new FooterLoadMoreAdapterWrapper(adapter, recyclerView, listener);
            footerLoadMoreAdapterWrapper.addFooter(viewBinder);
            adapter = footerLoadMoreAdapterWrapper;
            return this;
        }

        public RecyclerViewAdapter build() {
            return adapter;
        }

        private void initHFAdapterWrapper() {
            if (headerAndFooterAdapterWrapper == null) {
                headerAndFooterAdapterWrapper = new HeaderAndFooterAdapterWrapper(adapter);
                adapter = headerAndFooterAdapterWrapper;
            }
        }


    }
}
