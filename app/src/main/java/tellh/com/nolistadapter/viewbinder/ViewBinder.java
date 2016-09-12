package tellh.com.nolistadapter.viewbinder;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import tellh.com.nolistadapter.LayoutItemType;
import tellh.com.nolistadapter.RecyclerViewAdapter;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class ViewBinder<T, VH extends RecyclerView.ViewHolder> implements LayoutItemType {
    public abstract RecyclerView.ViewHolder provideViewHolder(View itemView);

    public abstract void bindView(RecyclerViewAdapter adapter, VH holder, int position, T entity);

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View rootView) {
            super(rootView);
        }

        protected <T extends View> T findViewById(@IdRes int id) {
            return (T) itemView.findViewById(id);
        }
    }

}
