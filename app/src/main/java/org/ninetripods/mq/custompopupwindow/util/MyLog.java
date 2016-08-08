package org.ninetripods.mq.custompopupwindow.util;


import android.util.Log;

import org.ninetripods.mq.custompopupwindow.BuildConfig;


/**
 * Created by MQ on 2016/8/6.
 */
public class MyLog {
    public static int v(String tag, String msg) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.v(tag, msg);
        } else {
            return -1;
        }
    }

    public static int v(String tag, String msg, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.v(tag, msg, tr);
        } else {
            return -1;
        }
    }

    public static int d(String tag, String msg) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.d(tag, msg);
        } else {
            return -1;
        }
    }

    public static int d(String tag, String msg, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.d(tag, msg, tr);
        } else {
            return -1;
        }
    }

    public static int i(String tag, String msg) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.i(tag, msg);
        } else {
            return -1;
        }
    }

    public static int i(String tag, String msg, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.i(tag, msg, tr);
        } else {
            return -1;
        }
    }

    public static int w(String tag, String msg) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.w(tag, msg);
        } else {
            return -1;
        }
    }

    public static int w(String tag, String msg, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.w(tag, msg, tr);
        } else {
            return -1;
        }
    }

    public static int w(String tag, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.w(tag, tr);
        } else {
            return -1;
        }
    }

    public static int e(String tag, String msg) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.e(tag, msg);
        } else {
            return -1;
        }
    }

    public static int e(String tag, String msg, Throwable tr) {
        if (BuildConfig.LEO_DEBUG) {
            return Log.e(tag, msg, tr);
        } else {
            return -1;
        }
    }

}
