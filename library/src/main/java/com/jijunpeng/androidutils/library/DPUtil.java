package com.jijunpeng.androidutils.library;

import android.content.Context;

/**
 * Created by jijunpeng on 17/3/13.
 */

public class DPUtil {
    private static String TAG = DPUtil.class.getSimpleName();

    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dpValue * scale);
    }

    public static float px2dp(Context context, int pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (float) pxValue / scale;
    }

}
