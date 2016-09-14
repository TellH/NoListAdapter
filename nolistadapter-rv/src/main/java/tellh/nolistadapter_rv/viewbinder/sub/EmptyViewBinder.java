package tellh.nolistadapter_rv.viewbinder.sub;

import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class EmptyViewBinder<VH extends ViewBinder.ViewHolder> extends ViewBinder<Object, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, Object entity) {
        bindEmptyView(adapter, holder, position);
    }

    protected abstract void bindEmptyView(IListAdapter adapter, VH holder, int position);
}
