package com.tellh.nolistadapter.viewbinder.base;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.IViewBinder;
import com.tellh.nolistadapter.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class RecyclerViewBinder<T extends IViewBinderProvider, VH extends RecyclerView.ViewHolder> implements IViewBinder<T, VH> {
    public abstract VH provideViewHolder(View itemView);

    public abstract void bindView(IListAdapter adapter, VH holder, int position, T entity);

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View rootView) {
            super(rootView);
        }

        protected <T extends View> T findViewById(@IdRes int id) {
            return (T) itemView.findViewById(id);
        }
    }

}
