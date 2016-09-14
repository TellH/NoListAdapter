package tellh.nolistadapter_lv;

import android.view.View;

import tellh.nolistadapter_common.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/14 :)
 */
public abstract class EasyListViewBinder<T extends IViewBinderProvider> extends ListViewBinder<T, EasyListViewHolder> {
    @Override
    public EasyListViewHolder provideViewHolder(View itemView) {
        return new EasyListViewHolder(itemView);
    }
}
