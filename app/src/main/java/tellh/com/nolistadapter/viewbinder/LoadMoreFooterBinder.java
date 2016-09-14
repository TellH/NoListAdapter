package tellh.com.nolistadapter.viewbinder;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_rv.adapter.FooterLoadMoreAdapterWrapper;
import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.sub.FooterViewBinder;
import tellh.nolistadapter_rv.viewbinder.base.ViewBinder;

/**
 * Created by tlh on 2016/9/13 :)
 */
public class LoadMoreFooterBinder extends FooterViewBinder<LoadMoreFooterBinder.ViewHolder> {
    private String toLoadText = "Pull to load more";
    private String noMoreText = "no more data";
    private String loadingText = "Loading…";

    @Override
    protected void bindFooter(IListAdapter adapter, ViewHolder holder, int position) {
        FooterLoadMoreAdapterWrapper adapterWrapper = (FooterLoadMoreAdapterWrapper) adapter;
        if (adapter.getDisplayList().size() == 0) {
            holder.progressBar.setVisibility(View.INVISIBLE);
            holder.tvFooter.setText("No Data");
            return;
        }
        switch (adapterWrapper.getFooterStatus()) {
            case PULL_TO_LOAD_MORE:
                holder.progressBar.setVisibility(View.VISIBLE);
                holder.tvFooter.setText(toLoadText);
                break;
            case LOADING:
                holder.progressBar.setVisibility(View.VISIBLE);
                holder.tvFooter.setText(loadingText);
                break;
            case NO_MORE:
                holder.tvFooter.setText(noMoreText);
                holder.progressBar.setVisibility(View.INVISIBLE);
                break;
        }
        holder.ivFooter.setImageResource(R.mipmap.ic_launcher);
    }

    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new LoadMoreFooterBinder.ViewHolder(itemView);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.footer_load_more;
    }

    public static class ViewHolder extends ViewBinder.ViewHolder {
        public TextView tvFooter;
        public ProgressBar progressBar;
        public ImageView ivFooter;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvFooter = (TextView) rootView.findViewById(R.id.tv_footer);
            this.progressBar = (ProgressBar) rootView.findViewById(R.id.progressBar);
            this.ivFooter = (ImageView) rootView.findViewById(R.id.iv_footer);
        }

    }
}
