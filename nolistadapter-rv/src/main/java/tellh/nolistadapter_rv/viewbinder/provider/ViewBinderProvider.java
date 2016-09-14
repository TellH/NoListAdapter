package tellh.nolistadapter_rv.viewbinder.provider;

import android.support.v4.util.SparseArrayCompat;

import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.LayoutItemType;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class ViewBinderProvider implements IViewBinderProvider, LayoutItemType {
    private ViewBinder viewBinder;

    @Override
    public final ViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<ViewBinder> viewBinderPool, int position) {
        if (viewBinder == null) {
            viewBinder = viewBinderPool.get(getItemLayoutId(adapter));
        }
        return viewBinder;
    }
}
