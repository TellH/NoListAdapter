package tellh.com.nolistadapter;

import android.view.View;
import android.widget.Button;

import tellh.com.nolistadapter.adapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.HeaderViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class ControlerViewBinder extends HeaderViewBinder<ControlerViewBinder.ViewHolder> {

    private MainActivity activity;

    public ControlerViewBinder(MainActivity activity) {
        this.activity = activity;
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_controler;
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ControlerViewBinder.ViewHolder(itemView);
    }

    @Override
    protected void bindHeader(final IListAdapter adapter, ViewHolder holder, int position) {
        holder.btnRefresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.refresh();
            }
        });
        holder.btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.clear();
            }
        });
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public Button btnRefresh;
        public Button btnClear;

        public ViewHolder(View rootView) {
            super(rootView);
            this.btnRefresh = (Button) rootView.findViewById(R.id.btn_refresh);
            this.btnClear = (Button) rootView.findViewById(R.id.btn_clear);
        }

    }
}
