package tellh.com.nolistadapter.viewbinder;

import android.support.v4.util.SparseArrayCompat;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class ViewBinderProvider implements IViewBinderProvider {
    private ViewBinder viewBinder;

    @Override
    public final ViewBinder provideViewBinder(SparseArrayCompat<ViewBinder> viewBinderPool, int position) {
        if (viewBinder == null) {
            viewBinder = viewBinderPool.get(getItemLayoutId());
        }
        return viewBinder;
    }
}
