package tellh.nolistadapter_lv;

import android.support.v4.util.SparseArrayCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import tellh.nolistadapter_common.DataBean;

public class ListViewAdapter extends BaseAdapter implements IListAdapter_LV {
    private static int SIZE_VIEW_BINDER_POOL = 10;

    private List<DataBean> displayList;
    private SparseArrayCompat<ListViewBinder> viewBinderPool;

    public ListViewAdapter(List<DataBean> displayList) {
        viewBinderPool = new SparseArrayCompat<>(SIZE_VIEW_BINDER_POOL);
        if (displayList == null)
            displayList = new ArrayList<>();
        this.displayList = displayList;
    }

    @Override
    public List<DataBean> getDisplayList() {
        return displayList;
    }

    @Override
    public void addAll(List<? extends DataBean> list) {
        if (list == null)
            return;
        displayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void refresh(List<? extends DataBean> list) {
        if (list == null)
            return;
        displayList.clear();
        displayList.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void add(int pos, DataBean item) {
        displayList.add(pos, item);
        notifyDataSetChanged();
    }

    @Override
    public void delete(int pos) {
        displayList.remove(pos);
        notifyDataSetChanged();
    }

    @Override
    public void swap(int fromPosition, int toPosition) {
        Collections.swap(displayList, fromPosition, toPosition);
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
        return displayList == null ? 0 : displayList.size();
    }

    @Override
    public int getItemViewType(int position) {
        //getItemViewType() should <= getViewTypeCount().
        return viewBinderPool.indexOfKey(displayList.get(position).getItemLayoutId(this));
    }

    @Override
    public int getViewTypeCount() {
        return viewBinderPool.size();
    }

    @Override
    public Object getItem(int position) {
        return displayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        DataBean entity = displayList.get(position);
        ListViewBinder viewBinder = (ListViewBinder) entity.provideViewBinder(this, viewBinderPool, position);
        final ListViewBinder.ViewHolder holder;
        View itemView;
        if (convertView == null) {
            itemView = LayoutInflater.from(parent.getContext())
                    .inflate(viewBinder.getItemLayoutId(this), parent, false);
            holder = (ListViewBinder.ViewHolder) viewBinder.provideViewHolder(itemView);
            itemView.setTag(holder);
        } else {
            itemView = convertView;
            holder = (ListViewBinder.ViewHolder) itemView.getTag();
        }
        viewBinder.bindView(this, holder, position, entity);
        return itemView;
    }

    public static void setViewBinderPoolInitSize(int size) {
        SIZE_VIEW_BINDER_POOL = size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private ListViewAdapter adapter;

        public Builder() {
            adapter = new ListViewAdapter(null);
        }

        public Builder displayList(List<? extends DataBean> displayList) {
            List<DataBean> adapterList = adapter.getDisplayList();
            for (DataBean dataBean : displayList) {
                adapterList.add(dataBean);
            }
            return this;
        }

        public Builder addItemType(ListViewBinder viewBinder) {
            adapter.viewBinderPool.put(viewBinder.getItemLayoutId(adapter), viewBinder);
            return this;
        }

        public ListViewAdapter build() {
            return adapter;
        }
    }
}
