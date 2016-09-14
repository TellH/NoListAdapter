package tellh.com.nolistadapter.viewbinder.lv;

import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import tellh.com.nolistadapter.R;
import tellh.com.nolistadapter.bean.ImageItem;
import tellh.nolistadapter_common.IListAdapter;
import tellh.nolistadapter_lv.ListViewBinder;

/**
 * Created by tlh on 2016/9/14 :)
 */
public class ImageItemListViewBinder extends ListViewBinder<ImageItem, ImageItemListViewBinder.ViewHolder> {
    @Override
    public ViewHolder provideViewHolder(View itemView) {
        return new ViewHolder(itemView);
    }

    @Override
    public void bindView(IListAdapter adapter, ViewHolder holder, int position, ImageItem entity) {
        Picasso.with(holder.image.getContext())
                .load(entity.url)
                .placeholder(R.mipmap.ic_launcher)
                .into(holder.image);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_image;
    }

    public static class ViewHolder extends ListViewBinder.ViewHolder {
        public ImageView image;

        public ViewHolder(View rootView) {
            super(rootView);
            this.image = (ImageView) rootView.findViewById(R.id.image);
        }

    }
}
