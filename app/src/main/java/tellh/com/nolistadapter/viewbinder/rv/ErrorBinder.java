package tellh.com.nolistadapter.viewbinder.rv;

import android.view.View;
import android.widget.Button;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.ErrorRecyclerViewBinder;

/**
 * Created by tlh on 2016/9/14 :)
 */
public class ErrorBinder extends ErrorRecyclerViewBinder<ErrorBinder.ViewHolder> {
    OnReLoadCallback callback;

    public ErrorBinder(OnReLoadCallback callback) {
        this.callback = callback;
    }

    @Override
    protected void bindErrorView(IListAdapter adapter, ViewHolder holder, int position) {
        holder.btn_refresh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (callback != null)
                    callback.reload();
            }
        });
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.error_view;
    }

    public static class ViewHolder extends RecyclerViewBinder.ViewHolder {
        Button btn_refresh;

        public ViewHolder(View rootView) {
            super(rootView);
            btn_refresh = findViewById(R.id.btn_refresh);
        }
    }

    public interface OnReLoadCallback {
        void reload();
    }

}
