package tellh.com.nolistadapter.viewbinder.utils;

import android.view.View;

import tellh.com.nolistadapter.viewbinder.base.RecyclerViewBinder;
import com.tellh.nolistadapter.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class EasyRecyclerViewBinder<T extends IViewBinderProvider> extends RecyclerViewBinder<T, EasyRecyclerViewHolder> {
    @Override
    final public EasyRecyclerViewHolder provideViewHolder(View itemView) {
        return new EasyRecyclerViewHolder(itemView);
    }
}
