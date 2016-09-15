package com.tellh.nolistadaptersample.rv;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.adapter.FooterLoadMoreAdapterWrapper;
import com.tellh.nolistadapter.viewbinder.base.RecyclerViewBinder;
import com.tellh.nolistadapter.viewbinder.sub.FooterRecyclerViewBinder;

import tellh.com.nolistadapter.R;

/**
 * Created by tlh on 2016/9/13 :)
 */
public class LoadMoreFooterBinderRecycler extends FooterRecyclerViewBinder<LoadMoreFooterBinderRecycler.ViewHolder> {
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
        return new LoadMoreFooterBinderRecycler.ViewHolder(itemView);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.footer_load_more;
    }

    public static class ViewHolder extends RecyclerViewBinder.ViewHolder {
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
