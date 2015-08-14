package com.jiuan.app.framedemo;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.jiuan.app.framedemo.widget.CircleImageView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by ZhangKong on 2015/8/12.
 */
public class DrawerNavigationMenu extends android.support.v4.app.Fragment implements View.OnClickListener{

    @Bind(R.id.iv_portrait)
    CircleImageView ivPortrait;
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.menu_user_info_layout)
    LinearLayout menuUserInfoLayout;
    @Bind(R.id.menu_user_info_login_tips_layout)
    LinearLayout menuUserInfoLoginTipsLayout;

    @Bind(R.id.menu_item_explore)
    LinearLayout menuItemExplore;
    @Bind(R.id.menu_item_myself)
    LinearLayout menuItemMyself;
    @Bind(R.id.menu_item_language)
    LinearLayout menuItemLanguage;
    @Bind(R.id.menu_item_shake)
    LinearLayout menuItemShake;
    @Bind(R.id.menu_item_scan)
    LinearLayout menuItemScan;
    @Bind(R.id.menu_item_setting)
    LinearLayout menuItemSetting;

    private static final String TAG = "DrawerNavigationMenu";




    public static DrawerNavigationMenu newInstance() {
        return new DrawerNavigationMenu();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main_drawer_menu, container, false);
        log("onCreateView");
        ButterKnife.bind(this,view);
        return view;
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        log("onAttach");
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        log("onViewCreated");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        log("onActivityCreated");
    }

    @Override
    public void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    @OnClick({R.id.menu_user_layout, R.id.menu_item_explore, R.id.menu_item_myself, R.id.menu_item_language,
            R.id.menu_item_shake, R.id.menu_item_scan, R.id.menu_item_setting})
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_user_layout:
                log("点击了用户按钮");
                break;
            case R.id.menu_item_explore:
                log("点击了公共项目按钮");
                break;
            case R.id.menu_item_myself:
                log("点击了自己的按钮");
                break;
            case R.id.menu_item_language:
                log("点击了语言按钮！");
                Intent intent = new Intent(getActivity(),LoginActivity.class);
                startActivity(intent);
                break;
        }
    }

    private void log(String str){
        Log.d(TAG ," " + str);

    }
}
