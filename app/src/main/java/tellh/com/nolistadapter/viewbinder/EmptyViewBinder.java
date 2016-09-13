package tellh.com.nolistadapter.viewbinder;

import tellh.com.nolistadapter.adapter.IListAdapter;

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
