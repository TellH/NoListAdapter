package tellh.nolistadapter_rv.viewbinder.sub;

import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class ErrorViewBinder<VH extends ViewBinder.ViewHolder> extends ViewBinder<Object, VH> {
    public boolean showNow;

    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, Object entity) {
        bindErrorView(adapter, holder, position);
    }

    protected abstract void bindErrorView(IListAdapter adapter, VH holder, int position);
}
