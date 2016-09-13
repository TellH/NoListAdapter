package tellh.com.nolistadapter.viewbinder;

import tellh.com.nolistadapter.adapter.IListAdapter;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class HeaderViewBinder<VH extends ViewBinder.ViewHolder> extends ViewBinder<Object, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, Object entity) {
        bindHeader(adapter, holder, position);
    }

    protected abstract void bindHeader(IListAdapter adapter, VH holder, int position);
}
