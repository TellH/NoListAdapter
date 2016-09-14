package tellh.nolistadapter_rv.viewbinder.provider;

import android.support.v4.util.SparseArrayCompat;

import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public interface IViewBinderProvider {
    ViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<ViewBinder> viewBinderPool, int position);
}
