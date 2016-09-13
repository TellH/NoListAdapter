package tellh.com.nolistadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import tellh.com.nolistadapter.adapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.HeaderViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class HeaderBinder extends HeaderViewBinder<HeaderBinder.ViewHolder> {
    private String hint;

    public HeaderBinder(String hint) {
        this.hint = hint;
    }

    @Override
    public RecyclerView.ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    protected void bindHeader(IListAdapter adapter, ViewHolder holder, int position) {
        holder.tvHeader.setText(hint);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_header;
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public TextView tvHeader;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvHeader = findViewById(R.id.tv_header);
        }

    }
}
