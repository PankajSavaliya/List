package com.socialinfotech.list;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.Toolbar;

import com.eowise.recyclerview.stickyheaders.StickyHeadersBuilder;
import com.eowise.recyclerview.stickyheaders.StickyHeadersItemDecoration;
import com.malinskiy.superrecyclerview.SuperRecyclerView;
import com.socialinfotech.list.adapter.InitialHeaderAdapter;
import com.socialinfotech.list.adapter.StringListAdapter;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.list)
    SuperRecyclerView mRecycler;
    @Bind(R.id.collapsing_toolbar)
    CollapsingToolbarLayout collapsingToolbar;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    private StickyHeadersItemDecoration top;
    private StringListAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);
        collapsingToolbar.setTitle("Pankaj");
        //  mRecycler.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecycler.setLayoutManager(new GridLayoutManager(MainActivity.this, 2));
        ArrayList<ResultEntity> data = new ArrayList<ResultEntity>();

        mAdapter = new StringListAdapter(MainActivity.this, data);
        mAdapter.setHasStableIds(true);
        top = new StickyHeadersBuilder()
                .setAdapter(mAdapter)
                .setRecyclerView(mRecycler.getRecyclerView())
                .setStickyHeadersAdapter(new InitialHeaderAdapter(data))
                .build();

        mRecycler.addItemDecoration(top);
        fillData();
        mRecycler.setAdapter(mAdapter);
    }

    private void fillData() {
        ArrayList<ResultEntity> data = new ArrayList<ResultEntity>();
        data.add(new ResultEntity("1", "one"));
        data.add(new ResultEntity("1", "two"));
        data.add(new ResultEntity("1", "three"));
        data.add(new ResultEntity("1", "four"));
        data.add(new ResultEntity("1", "five"));
        data.add(new ResultEntity("1", "six"));
        data.add(new ResultEntity("1", "seven"));
        data.add(new ResultEntity("1", "one"));
        data.add(new ResultEntity("1", "one"));
        data.add(new ResultEntity("1", "one"));
        data.add(new ResultEntity("1", "two"));
        data.add(new ResultEntity("2", "one"));
        data.add(new ResultEntity("2", "two"));
        data.add(new ResultEntity("2", "three"));
        data.add(new ResultEntity("2", "four"));
        data.add(new ResultEntity("2", "five"));
        data.add(new ResultEntity("2", "six"));
        data.add(new ResultEntity("2", "seven"));
        data.add(new ResultEntity("2", "one"));
        data.add(new ResultEntity("2", "one"));
        data.add(new ResultEntity("2", "one"));
        data.add(new ResultEntity("2", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("3", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        data.add(new ResultEntity("4", "two"));
        mAdapter.addAll(data);
    }
}
