package tellh.com.nolistadapter.viewbinder.rv;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;
import tellh.nolistadapter_rv.viewbinder.sub.FooterRecyclerViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class FooterBinder extends FooterRecyclerViewBinder<FooterBinder.ViewHolder> {
    private String txtFooter;

    public FooterBinder(String txtFooter) {
        this.txtFooter = txtFooter;
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    protected void bindFooter(IListAdapter adapter, ViewHolder holder, int position) {
        holder.ivFooter.setImageResource(R.mipmap.ic_launcher);
        holder.tvFooter.setText(txtFooter);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_footer;
    }

    public static class ViewHolder extends RecyclerViewBinder.ViewHolder {
        public ImageView ivFooter;
        public TextView tvFooter;

        public ViewHolder(View rootView) {
            super(rootView);
            this.ivFooter = (ImageView) rootView.findViewById(R.id.iv_footer);
            this.tvFooter = (TextView) rootView.findViewById(R.id.tv_footer);
        }

    }
}
