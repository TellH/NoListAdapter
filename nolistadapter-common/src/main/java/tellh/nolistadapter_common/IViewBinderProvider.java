package tellh.nolistadapter_common;

import android.support.v4.util.SparseArrayCompat;

/**
 * Created by tlh on 2016/9/12 :)
 */
public interface IViewBinderProvider {
    IViewBinder provideViewBinder(IListAdapter adapter, SparseArrayCompat<? extends IViewBinder> viewBinderPool, int position);
}
