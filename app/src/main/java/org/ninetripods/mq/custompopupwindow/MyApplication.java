package org.ninetripods.mq.custompopupwindow;

import android.app.Application;
import android.content.Context;

/**
 * Created by MQ on 2016/7/29.
 */
public class MyApplication extends Application {
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
