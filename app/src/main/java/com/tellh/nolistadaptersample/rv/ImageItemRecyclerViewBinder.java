package tellh.com.nolistadapter.viewbinder.rv;

import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import tellh.com.nolistadapter.R;
import com.tellh.nolistadaptersample.bean.ImageItem;
import com.tellh.nolistadapter.IListAdapter;
import tellh.com.nolistadapter.viewbinder.utils.EasyRecyclerViewBinder;
import tellh.com.nolistadapter.viewbinder.utils.EasyRecyclerViewHolder;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class ImageItemRecyclerViewBinder extends EasyRecyclerViewBinder<ImageItem> {

    @Override
    public void bindView(IListAdapter adapter, EasyRecyclerViewHolder holder, int position, ImageItem entity) {
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

//    protected class ViewHolder extends RecyclerViewBinder.ViewHolder {
//        ImageView imageView;
//
//        public ViewHolder(View rootView) {
//            super(rootView);
//            imageView = findViewById(R.id.image);
//        }
//    }
}
