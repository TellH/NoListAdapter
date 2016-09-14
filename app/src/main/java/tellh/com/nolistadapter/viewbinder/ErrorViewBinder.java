package tellh.com.nolistadapter.viewbinder;

import tellh.com.nolistadapter.adapter.IListAdapter;

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
