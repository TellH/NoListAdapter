package tellh.com.nolistadapter.viewbinder;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_rv.adapter.IListAdapter;
import tellh.nolistadapter_rv.viewbinder.utils.EasyViewBinder;
import tellh.nolistadapter_rv.viewbinder.utils.RecyclerViewHolder;
import tellh.nolistadapter_rv.viewbinder.provider.ViewBinderProvider;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class ImageItemViewBinder extends EasyViewBinder<ImageItemViewBinder.ImageItem> {

    @Override
    public void bindView(IListAdapter adapter, RecyclerViewHolder holder, int position, ImageItem entity) {
        ImageView imageView = holder.getImageView(R.id.image);
        Picasso.with(imageView.getContext())
                .load(entity.url)
                .placeholder(R.mipmap.ic_launcher)
                .into(imageView);
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_image;
    }

    public static class ImageItem extends ViewBinderProvider {
        public String url;

        public ImageItem(String url) {
            this.url = url;
        }

        @Override
        public int getItemLayoutId(IListAdapter adapter) {
            return R.layout.item_image;
        }
    }

//    protected class ViewHolder extends ViewBinder.ViewHolder {
//        ImageView imageView;
//
//        public ViewHolder(View rootView) {
//            super(rootView);
//            imageView = findViewById(R.id.image);
//        }
//    }
}
