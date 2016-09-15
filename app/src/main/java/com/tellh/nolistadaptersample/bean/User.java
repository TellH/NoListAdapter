package com.tellh.nolistadaptersample.bean;

import tellh.com.nolistadapter.R;
import com.tellh.nolistadapter.IListAdapter;
import com.tellh.nolistadapter.DataBean;

/**
 * Created by tlh on 2016/9/12 :)
 */
public class User extends DataBean {
    private String login;
    private int id;
    private String html_url;
    private String avatar_url;

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHtml_url() {
        return html_url;
    }

    public void setHtml_url(String html_url) {
        this.html_url = html_url;
    }

    @Override
    public int getItemLayoutId(IListAdapter adapter) {
        return R.layout.item_user;
    }
}
