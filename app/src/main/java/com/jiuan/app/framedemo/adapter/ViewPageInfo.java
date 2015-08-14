package com.jiuan.app.framedemo.adapter;

import android.os.Bundle;

/**
 * Created by ZhangKong on 2015/8/12.
 */
public final class ViewPageInfo {

    public final String tag;
    public final Class<?> clss;
    public final Bundle args;
    public final String title;

    public ViewPageInfo(String _title, String _tag, Class<?> _class, Bundle _args) {
        title = _title;
        tag = _tag;
        clss = _class;
        args = _args;
    }
}
