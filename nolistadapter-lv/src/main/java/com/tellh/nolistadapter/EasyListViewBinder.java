package com.tellh.nolistadapter;

import android.view.View;

/**
 * Created by tlh on 2016/9/14 :)
 */
public abstract class EasyListViewBinder<T extends IViewBinderProvider> extends ListViewBinder<T, EasyListViewHolder> {
    @Override
    public EasyListViewHolder provideViewHolder(View itemView) {
        return new EasyListViewHolder(itemView);
    }
}
