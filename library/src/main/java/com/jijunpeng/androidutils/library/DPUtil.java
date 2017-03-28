package com.jijunpeng.androidutils.library;

import android.content.Context;

/**
 * Created by jijunpeng on 17/3/13.
 * 自己编写的DP <-> px工具类
 */

public class DPUtil {
    private static String TAG = DPUtil.class.getSimpleName();

    /**
     * 将dp值转为px值
     *
     * @param context
     * @param dpValue 需要转换的dp值
     * @return 转换后的px值
     */
    public static int dp2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dpValue * scale);
    }

    /**
     * 将px转为dp
     *
     * @param context
     * @param pxValue 需要转换的px值
     * @return 转换后的dp值
     */
    public static float px2dp(Context context, int pxValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (float) pxValue / scale;
    }

}
