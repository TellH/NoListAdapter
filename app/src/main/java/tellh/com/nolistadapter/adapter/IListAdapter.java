package tellh.com.nolistadapter.adapter;

import java.util.List;

import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

/**
 * Created by tlh on 2016/9/13 :)
 */
public interface IListAdapter {
    List<ViewBinderProvider> getDisplayList();

    void addAll(List<ViewBinderProvider> list);

    void refresh(List<ViewBinderProvider> list);

    void add(int pos, ViewBinderProvider item);

    void delete(int pos);

    void swap(int fromPosition, int toPosition);
}
