package com.tellh.nolistadapter;

import java.util.List;

/**
 * Created by tlh on 2016/9/13 :)
 */
public interface IListAdapter {
    List<DataBean> getDisplayList();

    void addAll(List<? extends DataBean> list);

    void refresh(List<? extends DataBean> list);

    void add(int pos, DataBean item);

    void delete(int pos);

    void swap(int fromPosition, int toPosition);

}
