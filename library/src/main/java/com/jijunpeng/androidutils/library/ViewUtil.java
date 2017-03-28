package com.jijunpeng.androidutils.library;

import android.view.View;

/**
 * Created by jijunpeng on 17/3/27.
 * View的工具类
 */

public class ViewUtil {
    private static final String TAG = ViewUtil.class.getSimpleName();

    /**
     * 获取父试图
     *
     * @param child
     * @return 子View的父View
     */
    public static View getParentView(View child) {
        return ((View) child.getParent());
    }
}
