package tellh.nolistadapter_rv.adapter;

import android.support.v7.widget.RecyclerView;

import tellh.nolistadapter_common.IListAdapter;

/**
 * Created by tlh on 2016/9/14 :)
 */
public interface IListAdapter_RV extends IListAdapter {
    void clear(RecyclerView recyclerView);

    void showErrorView(RecyclerView recyclerView);

    void hideErrorView(RecyclerView recyclerView);
}
