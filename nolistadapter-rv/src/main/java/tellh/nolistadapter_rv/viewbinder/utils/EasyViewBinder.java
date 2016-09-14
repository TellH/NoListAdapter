package tellh.nolistadapter_rv.viewbinder.utils;

import android.view.View;

import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class EasyViewBinder<T> extends ViewBinder<T, RecyclerViewHolder> {
    @Override
    final public RecyclerViewHolder provideViewHolder(View itemView) {
        return new RecyclerViewHolder(itemView);
    }
}
