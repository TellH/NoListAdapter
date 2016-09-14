package tellh.nolistadapter_common;

import java.util.List;

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

}
