package com.jijunpeng.androidutils.library;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;

/**
 * Created by jijunpeng on 17/3/13.
 */

public class AppUtil {
    private static String TAG = AppUtil.class.getSimpleName();
    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getVersionName: ", e);
            return "0.0.0";
        }
    }
}
