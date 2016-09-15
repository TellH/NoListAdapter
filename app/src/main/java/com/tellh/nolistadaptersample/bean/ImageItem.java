package com.tellh.nolistadaptersample.bean;

import tellh.com.nolistadapter.R;
import com.tellh.nolistadapter.DataBean;
import com.tellh.nolistadapter.IListAdapter;

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