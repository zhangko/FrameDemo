package com.jiuan.app.framedemo.adapter;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.jiuan.app.framedemo.R;

/**
 * Created by ZhangKong on 2015/8/14.
 */
public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView name;

    public TextView state;

    private onItemClickListener mOnItemClickListener;


    public MyViewHolder(CardView v){
        super(v);
        v.setOnClickListener(this);
        name = (TextView)v.findViewById(R.id.name);
        state = (TextView)v.findViewById(R.id.state);
    }


    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null) {
            mOnItemClickListener.onItemClick(getPosition());
        }
    }

    public interface onItemClickListener {

        void onItemClick(int position);
    }

    public void setOnItemClickListener(onItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }


}
