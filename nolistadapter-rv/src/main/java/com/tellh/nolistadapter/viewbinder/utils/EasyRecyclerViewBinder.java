package com.tellh.nolistadapter.viewbinder.utils;

import android.view.View;

import com.tellh.nolistadapter.IViewBinderProvider;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class EasyRecyclerViewBinder<T extends IViewBinderProvider> extends RecyclerViewBinder<T, EasyRecyclerViewHolder> {
    @Override
    final public EasyRecyclerViewHolder provideViewHolder(View itemView) {
        return new EasyRecyclerViewHolder(itemView);
    }
}
