package tellh.com.nolistadapter;

import android.support.annotation.LayoutRes;
import android.support.v4.util.SparseArrayCompat;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import tellh.com.nolistadapter.adapter.HeaderAndFooterAdapterWrapper;
import tellh.com.nolistadapter.viewbinder.ViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static int SIZE_VIEW_BINDER_POOL = 10;
    private SparseArrayCompat<ViewBinder> viewBinderPool;
    protected List<? extends ViewBinderProvider> displayList;

    public RecyclerViewAdapter(List<? extends ViewBinderProvider> displayList) {
        viewBinderPool = new SparseArrayCompat<>(SIZE_VIEW_BINDER_POOL);
        if (displayList == null)
            displayList = new ArrayList<>();
        this.displayList = displayList;
    }

    public List<? extends ViewBinderProvider> getDisplayList() {
        return displayList;
    }

    @Override
    public int getItemViewType(int position) {
        return displayList.get(position).getItemLayoutId();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ViewBinder viewBinder = viewBinderPool.get(viewType);
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(viewBinder.getItemLayoutId(), parent, false);
        return viewBinder.provideViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewBinderProvider viewBinderProvider = displayList.get(position);
        viewBinderProvider.provideViewBinder(viewBinderPool, position).bindView(this, holder, position, viewBinderProvider);
    }

    @Override
    public int getItemCount() {
        return displayList == null ? 0 : displayList.size();
    }

    public ViewBinder findViewBinderFromPool(@LayoutRes int layoutId) {
        return viewBinderPool.get(layoutId);
    }

    public static void setViewBinderPoolInitSize(int size) {
        SIZE_VIEW_BINDER_POOL = size;
    }

    public void clearViewBinderCache() {
        viewBinderPool.clear();
    }

    public void addAll(List list) {
        if (list == null)
            return;
        displayList.addAll(list);
        notifyDataSetChanged();
    }

    public void refresh(List list) {
        if (list == null)
            return;
        displayList.clear();
        displayList.addAll(list);
        notifyDataSetChanged();
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
            adapter.addAll(displayList);
            return this;
        }

        public Builder addItemType(ViewBinder viewBinder) {
            adapter.viewBinderPool.put(viewBinder.getItemLayoutId(), viewBinder);
            return this;
        }

        public Builder addHeader(ViewBinder viewBinder) {
            initHFAdapterWrapper();
            headerAndFooterAdapterWrapper.addHeader(viewBinder);
            return this;
        }

        public Builder addFooter(ViewBinder viewBinder) {
            initHFAdapterWrapper();
            headerAndFooterAdapterWrapper.addFooter(viewBinder);
            return this;
        }

        public RecyclerViewAdapter build() {
            if (headerAndFooterAdapterWrapper != null) {
                return headerAndFooterAdapterWrapper;
            }
            return adapter;
        }

        private void initHFAdapterWrapper() {
            if (headerAndFooterAdapterWrapper == null) {
                headerAndFooterAdapterWrapper = new HeaderAndFooterAdapterWrapper(adapter);
            }
        }


    }
}
