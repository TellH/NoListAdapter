package com.tellh.nolistadapter.viewbinder.sub;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.IViewBinderProvider;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class ErrorRecyclerViewBinder<VH extends RecyclerViewBinder.ViewHolder> extends RecyclerViewBinder<IViewBinderProvider, VH> {
    public boolean showNow;

    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, IViewBinderProvider entity) {
        bindErrorView(adapter, holder, position);
    }

    protected abstract void bindErrorView(IListAdapter adapter, VH holder, int position);
}
