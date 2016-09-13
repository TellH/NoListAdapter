package tellh.com.nolistadapter.viewbinder;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by tlh on 2016/9/12 :)
 */
public abstract class EasyViewBinder<T> extends ViewBinder<T, RecyclerViewHolder> {
    @Override
    final public RecyclerView.ViewHolder provideViewHolder(View itemView) {
        return new RecyclerViewHolder(itemView);
    }
}
