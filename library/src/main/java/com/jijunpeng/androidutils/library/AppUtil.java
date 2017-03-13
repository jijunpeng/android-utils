package com.jijunpeng.androidutils.library;

import android.content.Context;
import android.content.pm.PackageManager;

/**
 * Created by jijunpeng on 17/3/13.
 */

public class AppUtil {
    public static String getVersionName(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            return "0.0.0";
        }
    }
}
