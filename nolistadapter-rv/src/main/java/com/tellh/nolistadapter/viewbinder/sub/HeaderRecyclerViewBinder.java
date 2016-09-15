package com.tellh.nolistadapter.viewbinder.sub;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.IViewBinderProvider;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class HeaderRecyclerViewBinder<VH extends RecyclerViewBinder.ViewHolder> extends RecyclerViewBinder<IViewBinderProvider, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, IViewBinderProvider entity) {
        bindHeader(adapter, holder, position);
    }

    protected abstract void bindHeader(IListAdapter adapter, VH holder, int position);
}
