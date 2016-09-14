package tellh.com.nolistadapter.bean;

import tellh.com.nolistadapter.R;
import tellh.nolistadapter_common.DataBean;
import tellh.nolistadapter_common.IListAdapter;

public class ImageItem extends DataBean {
    public String url;

    public ImageItem(String url) {
        this.url = url;
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_image;
    }
}