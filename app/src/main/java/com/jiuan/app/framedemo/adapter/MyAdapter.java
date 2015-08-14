package com.jiuan.app.framedemo.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.jiuan.app.framedemo.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhangKong on 2015/8/14.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> implements MyViewHolder.onItemClickListener {

    private List<String> array = new ArrayList<String>();

    public MyAdapter(List<String> list){
        array = list;
    }
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        CardView v = (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder holder = new MyViewHolder(v);
        holder.setOnItemClickListener(this);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.name.setText("这是第" + array.get(position) + "个卡片");
        holder.state.setText("这是第" + array.get(position) + "个卡片");


    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    @Override
    public void onItemClick(int position) {
        Log.d("TAG","你点击了第" + position +"卡片！");
    }
}
