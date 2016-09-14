package tellh.nolistadapter_common;

import android.view.View;

import tellh.nolistadapter_common.IListAdapter;

/**
 * Created by tlh on 2016/9/14 :)
 */
public interface IViewBinder<T, VH> {
    VH provideViewHolder(View itemView);

    void bindView(IListAdapter adapter, VH holder, int position, T entity);
}
