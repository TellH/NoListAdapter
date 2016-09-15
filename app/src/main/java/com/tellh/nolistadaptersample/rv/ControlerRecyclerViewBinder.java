package tellh.com.nolistadapter.viewbinder.rv;

import android.view.View;
import android.widget.Button;

import com.tellh.nolistadaptersample.RecyclerViewActivity;
import tellh.com.nolistadapter.R;
import com.tellh.nolistadapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.base.RecyclerViewBinder;
import tellh.com.nolistadapter.viewbinder.sub.HeaderRecyclerViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class ControlerRecyclerViewBinder extends HeaderRecyclerViewBinder<ControlerRecyclerViewBinder.ViewHolder> {

    private RecyclerViewActivity activity;

    public ControlerRecyclerViewBinder(RecyclerViewActivity activity) {
        this.activity = activity;
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_controler;
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ControlerRecyclerViewBinder.ViewHolder(itemView);
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

    public static class ViewHolder extends RecyclerViewBinder.ViewHolder {
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
