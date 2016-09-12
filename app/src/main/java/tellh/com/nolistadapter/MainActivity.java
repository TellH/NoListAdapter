package tellh.com.nolistadapter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

import tellh.com.nolistadapter.viewbinder.ControlerViewBinder;
import tellh.com.nolistadapter.viewbinder.ViewBinderProvider;

public class MainActivity extends AppCompatActivity {

    private RecyclerView list;
    private RecyclerViewAdapter adapter;

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
                .addItemType(new UserViewBinder()) //different item type have different ways to bind data to ViewHolder.
                .addItemType(new ImageItemViewBinder())
                .addHeader(new ControlerViewBinder(this))
                .addHeader(new HeaderBinder("I am the first header! 我是沙发"))
                .addHeader(new HeaderBinder("I am the second header! 我是板凳"))
                .addFooter(new FooterBinder("------I am the footer!------"))
                .addFooter(new FooterBinder("------我是有底线的！-------"))
                .displayList(displayList)
                .build();
        list.setAdapter(adapter);
    }

    private void initView() {
        list = (RecyclerView) findViewById(R.id.list);
        list.setLayoutManager(new LinearLayoutManager(this));
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
    }
}
