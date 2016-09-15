package com.tellh.nolistadapter.viewbinder.sub;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.IViewBinderProvider;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class EmptyRecyclerViewBinder<VH extends RecyclerViewBinder.ViewHolder> extends RecyclerViewBinder<IViewBinderProvider, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, IViewBinderProvider entity) {
        bindEmptyView(adapter, holder, position);
    }

    protected abstract void bindEmptyView(IListAdapter adapter, VH holder, int position);
}
