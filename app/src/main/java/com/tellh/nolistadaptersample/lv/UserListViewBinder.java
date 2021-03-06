package com.tellh.nolistadaptersample.lv;

import android.view.View;
import android.widget.TextView;

import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.ListViewBinder;
import com.tellh.nolistadaptersample.bean.User;

import tellh.com.nolistadapter.R;

/**
 * Created by tlh on 2016/9/14 :)
 */
public class UserListViewBinder extends ListViewBinder<User, UserListViewBinder.ViewHolder> {
    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(IListAdapter adapter, ViewHolder holder, int position, User entity) {
        holder.tvId.setText(String.valueOf(entity.getId()));
        holder.tvName.setText(entity.getLogin());
        holder.tvUrl.setText(entity.getHtml_url());
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_user;
    }

    public static class ViewHolder extends ListViewBinder.ViewHolder {
        public TextView tvId;
        public TextView tvName;
        public TextView tvUrl;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvId = (TextView) rootView.findViewById(R.id.tv_id);
            this.tvName = (TextView) rootView.findViewById(R.id.tv_name);
            this.tvUrl = (TextView) rootView.findViewById(R.id.tv_url);
        }

    }
}
