package tellh.com.nolistadapter.viewbinder;

import android.support.annotation.LayoutRes;
import android.view.View;

import tellh.com.nolistadapter.adapter.IListAdapter;

/**
 * Created by tlh on 2016/9/13 :)
 */
public class EasyEmptyViewBinder extends EmptyViewBinder<ViewBinder.ViewHolder> {
    @LayoutRes
    int layoutId;

    public EasyEmptyViewBinder(int layoutId) {
        this.layoutId = layoutId;
    }

    @Override
    protected void bindEmptyView(IListAdapter adapter, ViewHolder holder, int position) {
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
