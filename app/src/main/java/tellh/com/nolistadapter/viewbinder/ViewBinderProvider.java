package tellh.com.nolistadapter.viewbinder;

import android.support.v4.util.SparseArrayCompat;

import tellh.com.nolistadapter.adapter.IListAdapter;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class ViewBinderProvider implements IViewBinderProvider {
    private ViewBinder viewBinder;

    @Override
    public final ViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<ViewBinder> viewBinderPool, int position) {
        if (viewBinder == null) {
            viewBinder = viewBinderPool.get(getItemLayoutId(adapter));
        }
        return viewBinder;
    }
}
