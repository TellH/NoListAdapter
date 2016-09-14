package tellh.com.nolistadapter.viewbinder.lv;

import android.view.View;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import tellh.com.nolistadapter.bean.User;
import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_lv.ListViewBinder;

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
