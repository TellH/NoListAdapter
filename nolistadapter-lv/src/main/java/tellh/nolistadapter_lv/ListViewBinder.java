package tellh.nolistadapter_lv;

import android.support.annotation.IdRes;
import android.view.View;

import tellh.nolistadapter_common.IViewBinder;
import tellh.nolistadapter_common.IViewBinderProvider;
import tellh.nolistadapter_common.LayoutItemType;

/**
 * Created by tlh on 2016/9/14 :)
 */
public abstract class ListViewBinder<T extends IViewBinderProvider, VH extends ListViewBinder.ViewHolder>
        implements LayoutItemType, IViewBinder<T, VH> {
    public static class ViewHolder {
        public View rootView;
        public ViewHolder(View rootView) {
            this.rootView = rootView;
        }
        protected <T extends View> T findViewById(@IdRes int id) {
            return (T) rootView.findViewById(id);
        }
    }
}
