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

import tellh.com.nolistadapter.ImageItemViewBinder.ImageItem;
import tellh.com.nolistadapter.adapter.FooterLoadMoreAdapterWrapper;
import tellh.com.nolistadapter.adapter.RecyclerViewAdapter;
import tellh.com.nolistadapter.viewbinder.EasyEmptyViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

public class MainActivity extends AppCompatActivity implements FooterLoadMoreAdapterWrapper.OnReachFooterListener, ErrorBinder.OnReLoadCallback {

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
        Response response = gson.fromJson(Response.responseJsonPage1, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        adapter = RecyclerViewAdapter.builder()
                .displayList(displayList)
                .addItemType(new UserViewBinder()) //different item type have different ways to bind data to ViewHolder.
                .addItemType(new ImageItemViewBinder())
                .addHeader(new ControlerViewBinder(this))
                .addHeader(new HeaderBinder("I am the first header! 我是沙发"))
                .addHeader(new HeaderBinder("I am the second header! 我是板凳"))
                .addFooter(new FooterBinder("------I am the footer!------"))
                .addFooter(new FooterBinder("------我是有底线的！-------"))
                .setLoadMoreFooter(new LoadMoreFooterBinder(), list, this)
                .setEmptyView(new EasyEmptyViewBinder(R.layout.empty_view))
//                .setErrorView(new EasyErrorViewBinder(R.layout.error_view))
                .setErrorView(new ErrorBinder(this))
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
        refreshLayout.setRefreshing(true);
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage1, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
        adapter.refresh(displayList);
        adapter.hideErrorView(list);
        refreshLayout.setRefreshing(false);
    }

    public void loadMore() {
        FooterLoadMoreAdapterWrapper footerLoadMoreAdapterWrapper = (FooterLoadMoreAdapterWrapper) adapter;
        if (footerLoadMoreAdapterWrapper.getCurPage() == 3) {
            footerLoadMoreAdapterWrapper.setFooterStatus(FooterLoadMoreAdapterWrapper.FooterState.NO_MORE);
            return;
        }
        Gson gson = new Gson();
        Response response = gson.fromJson(Response.responseJsonPage2, Response.class);
        List<User> userList = response.getItems();
        List<ViewBinderProvider> displayList = new ArrayList<>();
        for (int i = 0; i < userList.size(); i++) {
            displayList.add(new ImageItem(userList.get(i).getAvatar_url()));
            displayList.add(userList.get(i));
        }
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

    public void showError() {
        adapter.showErrorView(list);
    }

    @Override
    public void reload() {
        refresh();
    }
}
