package com.jijunpeng.androidutils.library;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.util.Log;
import android.view.WindowManager;

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

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getVersionCode: ", e);
            return 0;
        }
    }

    public static Point getScreenSize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point result = new Point();
        wm.getDefaultDisplay().getSize(result);
        return result;
    }
}
