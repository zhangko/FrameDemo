package com.jiuan.app.framedemo.fragment;

import android.app.Activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;

import com.jiuan.app.framedemo.R;
import com.jiuan.app.framedemo.adapter.MyAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangKong on 2015/8/12.
 */
public class BaseSwipeRefreshFragment extends android.support.v4.app.Fragment implements SwipeRefreshLayout.OnRefreshListener,AdapterView.OnItemClickListener,AbsListView.OnScrollListener {

    private static final String TAG = "BaseSwRefreshFragment";

    private List<String> list ;

    @Override
    public void onCreate(Bundle onstatedInstanced){
        super.onCreate(onstatedInstanced);
        log("onCreate");
        list = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            list.add(""+ i);
        }

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        log("onCreateView");
        return inflater.inflate(R.layout.base_swiperefresh,container,false);

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        log("onAttach");

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
         log("onViewCreated");
        initView(view);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onRefresh() {

    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {

    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {

    }

    private void initView(View v){
        SwipeRefreshLayout  mSwipeRefreshLayout = (SwipeRefreshLayout)v.findViewById(R.id.swiperefreshlayout);
        mSwipeRefreshLayout.setOnRefreshListener(this);
        mSwipeRefreshLayout.setColorSchemeResources(R.color.swiperefresh_color1,
                R.color.swiperefresh_color2, R.color.swiperefresh_color3,
                R.color.swiperefresh_color4);

        RecyclerView recyclerView = (RecyclerView)v.findViewById(R.id.recycler);
        MyAdapter adapter = new MyAdapter(list);
        recyclerView.setAdapter(adapter);

    }

    private void log(String msg){
        Log.d(TAG,msg);

    }
}
