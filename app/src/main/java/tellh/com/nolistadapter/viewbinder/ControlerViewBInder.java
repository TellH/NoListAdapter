package tellh.com.nolistadapter.viewbinder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import tellh.com.nolistadapter.MainActivity;
import tellh.com.nolistadapter.R;
import tellh.com.nolistadapter.RecyclerViewAdapter;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class ControlerViewBinder extends ViewBinder<Object, ControlerViewBinder.ViewHolder> {

    private MainActivity activity;

    public ControlerViewBinder(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public int getItemLayoutId() {
        return R.layout.item_controler;
    }

    @Override
    public RecyclerView.ViewHolder provideViewHolder(View itemView) {
        return new ControlerViewBinder.ViewHolder(itemView);
    }

    @Override
    public void bindView(RecyclerViewAdapter adapter, ViewHolder holder, int position, Object entity) {
        holder.btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.refresh();
            }
        });
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public Button btnRefresh;

        public ViewHolder(View rootView) {
            super(rootView);
            this.btnRefresh = (Button) rootView.findViewById(R.id.btn_refresh);
        }

    }
}
