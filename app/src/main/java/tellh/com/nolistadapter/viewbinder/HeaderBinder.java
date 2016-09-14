package tellh.com.nolistadapter.viewbinder;

import android.view.View;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.sub.HeaderViewBinder;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class HeaderBinder extends HeaderViewBinder<HeaderBinder.ViewHolder> {
    private String hint;

    public HeaderBinder(String hint) {
        this.hint = hint;
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
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
