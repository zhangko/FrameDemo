package com.jiuan.app.framedemo.fragment;

import android.app.Activity;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jiuan.app.framedemo.R;
import com.jiuan.app.framedemo.adapter.ViewPageFragmentAdapter;
import com.jiuan.app.framedemo.widget.PagerSlidingTabStrip;

/**
 * Created by ZhangKong on 2015/8/12.
 */
public class BaseViewPagerFragment extends android.support.v4.app.Fragment {

    protected PagerSlidingTabStrip mTabStrip;
    protected ViewPager mViewPager;
    protected ViewPageFragmentAdapter mTabsAdapter;

    private static final String TAG = "BaseViewPagerFragment";

    public static BaseViewPagerFragment newInstance(){
        return new BaseViewPagerFragment();
    }



    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        log("onAttach");

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCteate");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        log("onCreateView");
        return inflater.inflate(R.layout.base_viewpager,null);

    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        log("onViewCreated");
        mTabStrip = (PagerSlidingTabStrip) view.findViewById(R.id.pager_tabstrip);


        mViewPager = (ViewPager)view.findViewById(R.id.pager);

        mTabsAdapter = new ViewPageFragmentAdapter(getChildFragmentManager(), mTabStrip, mViewPager);
        String[] title = getResources().getStringArray(R.array.explore_title_array);

        mTabsAdapter.addTab(title[0], "featured", BaseSwipeRefreshFragment.class, null);

        mTabsAdapter.addTab(title[1], "popular", BaseSwipeRefreshFragment.class, null);

        mTabsAdapter.addTab(title[2], "latest", BaseSwipeRefreshFragment.class, null);
        mTabsAdapter.notifyDataSetChanged();
        mViewPager.setOffscreenPageLimit(2);

    }

    private void log(String msg){
        Log.d(TAG,msg);
    }
}
