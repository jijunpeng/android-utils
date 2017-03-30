package com.jijunpeng.androidutils.library;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.view.WindowManager;

import static android.content.Context.TELEPHONY_SERVICE;

/**
 * Created by jijunpeng on 17/3/13.
 * App使用到的工具类，用于获取App的信息
 */

public class AppUtil {
    private static String TAG = AppUtil.class.getSimpleName();

    /**
     * 获取版本信息
     *
     * @param context
     * @return 版本
     */
    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getVersionName: ", e);
            return "0.0.0";
        }
    }

    /**
     * 获取版本号
     *
     * @param context
     * @return 版本号
     */
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(TAG, "getVersionCode: ", e);
            return 0;
        }
    }

    /**
     * 获取屏幕大小
     *
     * @param context
     * @return Point.x是屏幕宽度，Point.y是屏幕高度
     */
    public static Point getScreenSize(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Point result = new Point();
        wm.getDefaultDisplay().getSize(result);
        return result;
    }

    /**
     * 获取系统上的状态栏的高度
     *
     * @param context
     * @return 状态栏高度的px值
     */
    public static int getStatusBarHeight(Context context) {
        int statusBarHeight = -1;
        //获取status_bar_height资源的ID
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            //根据资源ID获取响应的尺寸值
            statusBarHeight = context.getResources().getDimensionPixelSize(resourceId);
        }
        return statusBarHeight;
    }

    /**
     * 获取手机设备唯一标识IMEI
     * <p>
     * 需要系统权限 android.permission.READ_PHONE_STATE
     *
     * @return 手机IMEI信息
     */
    public static String getDeviceIMEI(Context context, String defaultValue) {
        String myIMEI = ((TelephonyManager) context.getSystemService(TELEPHONY_SERVICE)).getDeviceId();
        if ("".equals(myIMEI) || myIMEI == null) {
            myIMEI = defaultValue;
        }
        return myIMEI;
    }
}
