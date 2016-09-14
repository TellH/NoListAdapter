package tellh.com.nolistadapter;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.widget.ListView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import tellh.com.nolistadapter.bean.ImageItem;
import tellh.com.nolistadapter.bean.Response;
import tellh.com.nolistadapter.bean.User;
import tellh.com.nolistadapter.viewbinder.lv.ImageItemListViewBinder;
import tellh.com.nolistadapter.viewbinder.lv.UserListViewBinder;
import tellh.nolistadapter_common.DataBean;
import tellh.nolistadapter_lv.ListViewAdapter;

public class ListViewActivity extends AppCompatActivity {

    private ListView list;
    private SwipeRefreshLayout refreshLayout;
    private ListViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        initView();
        initData();
    }

    private void initData() {
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage1, Response.class);
        List<User> userList = response.getItems();
        List<DataBean> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        adapter = ListViewAdapter.builder()
                .displayList(displayList)
                .addItemType(new UserListViewBinder())
                .addItemType(new ImageItemListViewBinder())
                .build();
        list.setAdapter(adapter);
        list.addHeaderView(LayoutInflater.from(this).inflate(R.layout.item_header, null));
    }

    private void initView() {
        list = (ListView) findViewById(R.id.list);
        refreshLayout = (SwipeRefreshLayout) findViewById(R.id.refreshLayout);
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh();
                    }
                }, 1000);
            }
        });
    }

    private void refresh() {
        refreshLayout.setRefreshing(true);
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage1, Response.class);
        List<User> userList = response.getItems();
        List<DataBean> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        refreshLayout.setRefreshing(false);
    }
}
