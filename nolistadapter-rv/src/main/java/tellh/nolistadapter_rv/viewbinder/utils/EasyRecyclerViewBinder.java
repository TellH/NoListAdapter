package tellh.nolistadapter_rv.viewbinder.utils;

import android.view.View;

import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_common.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class EasyRecyclerViewBinder<T extends IViewBinderProvider> extends RecyclerViewBinder<T, EasyRecyclerViewHolder> {
    @Override
    final public EasyRecyclerViewHolder provideViewHolder(View itemView) {
        return new EasyRecyclerViewHolder(itemView);
    }
}
