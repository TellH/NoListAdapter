package tellh.nolistadapter_rv.viewbinder.sub;

import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_common.IViewBinderProvider;

/**
 * Created by tlh on 2016/9/13 :)
 */
public abstract class FooterRecyclerViewBinder<VH extends RecyclerViewBinder.ViewHolder> extends RecyclerViewBinder<IViewBinderProvider, VH> {
    @Override
    final public void bindView(IListAdapter adapter, VH holder, int position, IViewBinderProvider entity) {
        bindFooter(adapter, holder, position);
    }

    protected abstract void bindFooter(IListAdapter adapter, VH holder, int position);
}
