package com.tuyuanlin.uibox.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Copyright (C) 2013, Xiaomi Inc. All rights reserved.
 */

public class ListWindowActivity extends AppCompatActivity {
    @BindView(R.id.view_list)
    RecyclerView mListView;

    private ListWindowAdapter mAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_window);
        ButterKnife.bind(this);

        mAdapter = new ListWindowAdapter();
        mListView.setAdapter(mAdapter);
    }
}
