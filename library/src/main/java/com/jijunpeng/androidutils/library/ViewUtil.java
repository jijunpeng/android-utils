package com.jijunpeng.androidutils.library;

import android.view.View;

/**
 * Created by jijunpeng on 17/3/27.
 */

public class ViewUtil {
    private static final String TAG = ViewUtil.class.getSimpleName();

    public static View getParentView(View child) {
        return ((View) child.getParent());
    }
}
