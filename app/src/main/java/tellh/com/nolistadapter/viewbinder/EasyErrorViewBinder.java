package tellh.com.nolistadapter.viewbinder;

import android.support.annotation.LayoutRes;
import android.view.View;

import tellh.com.nolistadapter.adapter.IListAdapter;

/**
 * Created by tlh on 2016/9/13 :)
 */
public class EasyErrorViewBinder extends ErrorViewBinder<ViewBinder.ViewHolder> {
    @LayoutRes
    int layoutId;

    public EasyErrorViewBinder(@LayoutRes int layoutId) {
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
