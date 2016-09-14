package tellh.nolistadapter_common;

import android.view.View;

/**
 * Created by tlh on 2016/9/14 :)
 */
public interface IViewBinder<T, VH> extends LayoutItemType {
    VH provideViewHolder(View itemView);

    void bindView(IListAdapter adapter, VH holder, int position, T entity);
}
