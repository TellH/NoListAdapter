package com.tellh.nolistadapter;

import android.support.annotation.IdRes;
import android.view.View;

/**
 * Created by tlh on 2016/9/14 :)
 */
public abstract class ListViewBinder<T extends IViewBinderProvider, VH extends ListViewBinder.ViewHolder>
        implements LayoutItemType, IViewBinder<T, VH> {
    public static class ViewHolder {
        public View itemView;
        public ViewHolder(View rootView) {
            this.itemView = rootView;
        }
        protected <T extends View> T findViewById(@IdRes int id) {
            return (T) itemView.findViewById(id);
        }
    }
}
