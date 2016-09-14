package tellh.com.nolistadapter.viewbinder.rv;

import android.view.View;
import android.widget.TextView;

import tellh.com.nolistadapter.R;
import tellh.com.nolistadapter.bean.User;
import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.base.RecyclerViewBinder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class UserRecyclerViewBinder extends RecyclerViewBinder<User, UserRecyclerViewBinder.ViewHolder> {
    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new UserRecyclerViewBinder.ViewHolder(itemView);
    }

    @Override
    public void bindView(IListAdapter adapter, UserRecyclerViewBinder.ViewHolder holder, int position, User entity) {
        holder.tvId.setText(String.valueOf(entity.getId()));
        holder.tvName.setText(entity.getLogin());
        holder.tvUrl.setText(entity.getHtml_url());
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_user;
    }

    protected class ViewHolder extends RecyclerViewBinder.ViewHolder {
        public TextView tvId;
        public TextView tvName;
        public TextView tvUrl;

        public ViewHolder(View rootView) {
            super(rootView);
            this.tvId = findViewById(R.id.tv_id);
            this.tvName = findViewById(R.id.tv_name);
            this.tvUrl = findViewById(R.id.tv_url);
        }

    }
}
