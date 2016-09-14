package tellh.nolistadapter_rv.viewbinder.utils;

import android.support.annotation.LayoutRes;
import android.view.View;

import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.ErrorRecyclerViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public class EasyErrorRecyclerViewBinder extends ErrorRecyclerViewBinder<RecyclerViewBinder.ViewHolder> {
    @LayoutRes
    int layoutId;

    public EasyErrorRecyclerViewBinder(@LayoutRes int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    protected void bindErrorView(IListAdapter adapter, ViewHolder holder, int position) {
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return layoutId;
    }
}
