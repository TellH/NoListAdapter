package com.tellh.nolistadaptersample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import tellh.com.nolistadapter.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRV(View view) {
        startActivity(new Intent(this, RecyclerViewActivity.class));
    }

    public void onClickLV(View view) {
        startActivity(new Intent(this, ListViewActivity.class));
    }
}
