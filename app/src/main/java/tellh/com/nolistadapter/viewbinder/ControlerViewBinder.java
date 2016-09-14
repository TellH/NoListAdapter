package tellh.com.nolistadapter.viewbinder;

import android.view.View;
import android.widget.Button;

import tellh.com.nolistadapter.MainActivity;
import tellh.com.nolistadapter.R;
import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.sub.HeaderViewBinder;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

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
        holder.btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.showError();
            }
        });
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public Button btnRefresh;
        public Button btnClear;
        public Button btnError;

        public ViewHolder(View rootView) {
            super(rootView);
            this.btnRefresh = (Button) rootView.findViewById(R.id.btn_refresh);
            this.btnClear = (Button) rootView.findViewById(R.id.btn_clear);
            this.btnError = (Button) rootView.findViewById(R.id.btn_error);
        }

    }
}
