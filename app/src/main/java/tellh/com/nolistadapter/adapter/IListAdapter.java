package tellh.com.nolistadapter.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

/**
 * Created by tlh on 2016/9/13 :)
 */
public interface IListAdapter {
    List<ViewBinderProvider> getDisplayList();

    void addAll(List<? extends ViewBinderProvider> list);

    void refresh(List<? extends ViewBinderProvider> list);

    void add(int pos, ViewBinderProvider item);

    void delete(int pos);

    void swap(int fromPosition, int toPosition);

    void clear(RecyclerView recyclerView);
}
