package tellh.com.nolistadapter.viewbinder;

import android.support.v4.util.SparseArrayCompat;

import tellh.com.nolistadapter.adapter.IListAdapter;

/**
 * Created by tlh on 2016/9/12 :)
 */
public interface IViewBinderProvider extends LayoutItemType {
    ViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<ViewBinder> viewBinderPool, int position);
}
