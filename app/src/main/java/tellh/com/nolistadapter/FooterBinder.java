package tellh.com.nolistadapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import tellh.com.nolistadapter.viewbinder.ViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class FooterBinder extends ViewBinder<Object, FooterBinder.ViewHolder> {
    private String txtFooter;

    public FooterBinder(String txtFooter) {
        this.txtFooter = txtFooter;
    }

    @Override
    public RecyclerView.ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(RecyclerViewAdapter adapter, ViewHolder holder, int position, Object entity) {
        holder.ivFooter.setImageResource(R.mipmap.ic_launcher);
        holder.tvFooter.setText(txtFooter);
    }

    @Override
    public int getItemLayoutId() {
        return R.layout.item_footer;
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public ImageView ivFooter;
        public TextView tvFooter;

        public ViewHolder(View rootView) {
            super(rootView);
            this.ivFooter = (ImageView) rootView.findViewById(R.id.iv_footer);
            this.tvFooter = (TextView) rootView.findViewById(R.id.tv_footer);
        }

    }
}
