package tellh.com.nolistadapter.viewbinder.rv;

import android.view.View;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import com.tellh.nolistadapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.sub.HeaderRecyclerViewBinder;
import tellh.com.nolistadapter.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class HeaderBinder extends HeaderRecyclerViewBinder<HeaderBinder.ViewHolder> {
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

    public static class ViewHolder extends RecyclerViewBinder.ViewHolder {
        public TextView tvHeader;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvHeader = findViewById(R.id.tv_header);
        }

    }
}
