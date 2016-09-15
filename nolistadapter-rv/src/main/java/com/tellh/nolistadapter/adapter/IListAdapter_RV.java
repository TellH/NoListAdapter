package com.tellh.nolistadapter.adapter;

import android.support.v7.widget.RecyclerView;

import com.tellh.nolistadapter.IListAdapter;

/**
 * Created by tlh on 2016/9/14 :)
 */
public interface IListAdapter_RV extends IListAdapter {
    void clear(RecyclerView recyclerView);

    void showErrorView(RecyclerView recyclerView);

    void hideErrorView(RecyclerView recyclerView);
}
