package com.jijunpeng.androidutils.library;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by jijunpeng on 2017-4-24.
 */

public class DateUtil {
    public static long calculateTwoTime(Date start, Date end, int calendarField) {
        long time1 = start.getTime();
        long time2 = end.getTime();
        long result = time2 - time1;
        switch (calendarField) {
            case Calendar.MILLISECOND:
                return result;
            case Calendar.SECOND:
                return result / 1000;
            case Calendar.MINUTE:
                return result / 1000 / 60;
            case Calendar.HOUR:
            case Calendar.HOUR_OF_DAY:
                return result / 1000 / 60 / 60;
            case Calendar.DAY_OF_MONTH:
            case Calendar.DAY_OF_WEEK:
            case Calendar.DAY_OF_WEEK_IN_MONTH:
            case Calendar.DAY_OF_YEAR:
                return result / 1000 / 60 / 60 / 24;
            case Calendar.WEEK_OF_MONTH:
            case Calendar.WEEK_OF_YEAR:
                return result / 1000 / 60 / 60 / 24 / 7;
            case Calendar.MONTH:
                return result / 1000 / 60 / 60 / 24 / 30;
            case Calendar.YEAR:
                return result / 1000 / 60 / 60 / 24 / 365;
            default:
                return result;
        }
    }

}
