package tellh.com.nolistadapter;

import android.view.View;
import android.widget.Button;

import tellh.com.nolistadapter.adapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.ErrorViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinder;

/**
 * Created by tlh on 2016/9/14 :)
 */
public class ErrorBinder extends ErrorViewBinder<ErrorBinder.ViewHolder> {
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

    public static class ViewHolder extends ViewBinder.ViewHolder {
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
