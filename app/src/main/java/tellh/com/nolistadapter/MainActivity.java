package tellh.com.nolistadapter;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import tellh.com.nolistadapter.adapter.FooterLoadMoreAdapterWrapper;
import tellh.com.nolistadapter.adapter.RecyclerViewAdapter;
import tellh.com.nolistadapter.viewbinder.EasyEmptyViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

public class MainActivity extends AppCompatActivity implements FooterLoadMoreAdapterWrapper.OnReachFooterListener {

    private RecyclerView list;
    private RecyclerViewAdapter adapter;
    private SwipeRefreshLayout refreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initData();
    }

    private void initData() {
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.reponseJsonPage1, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItemViewBinder.ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        adapter = RecyclerViewAdapter.builder()
                .displayList(displayList)
                .setEmptyView(new EasyEmptyViewBinder(R.layout.empty_view))
                .addItemType(new UserViewBinder()) //different item type have different ways to bind data to ViewHolder.
                .addItemType(new ImageItemViewBinder())
                .addHeader(new ControlerViewBinder(this))
                .addHeader(new HeaderBinder("I am the first header! 我是沙发"))
                .addHeader(new HeaderBinder("I am the second header! 我是板凳"))
                .addFooter(new FooterBinder("------I am the footer!------"))
                .addFooter(new FooterBinder("------我是有底线的！-------"))
                .setLoadMoreFooter(new LoadMoreFooterBinder(), list, this)
                .build();
        list.setAdapter(adapter);
    }

    private void initView() {
        list = (RecyclerView) findViewById(R.id.list);
        refreshLayout = (SwipeRefreshLayout) findViewById(R.id.refreshLayout);
        list.setLayoutManager(new LinearLayoutManager(this));
        refreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh();
                    }
                }, 800);
            }
        });
    }

    @Override
    protected void onDestroy() {
        adapter.clearViewBinderCache();
        super.onDestroy();
    }

    public void refresh() {
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage2, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItemViewBinder.ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        adapter.refresh(displayList);
        refreshLayout.setRefreshing(false);
    }

    public void loadMore() {
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage2, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItemViewBinder.ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        FooterLoadMoreAdapterWrapper footerLoadMoreAdapterWrapper = (FooterLoadMoreAdapterWrapper) adapter;
        footerLoadMoreAdapterWrapper.OnGetData(displayList, FooterLoadMoreAdapterWrapper.UpdateType.LOAD_MORE);
    }

    @Override
    public void onToLoadMore(int curPage) {
        Toast.makeText(MainActivity.this, "on to load more!", Toast.LENGTH_SHORT).show();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                loadMore();
            }
        }, 800);
    }

    public void clear() {
        adapter.clear(list);
    }
}
