package org.ninetripods.mq.custompopupwindow.util;

import android.content.Context;
import android.widget.Toast;

import org.ninetripods.mq.custompopupwindow.MyApplication;

/**
 * Created by MQ on 2016/7/29.
 */
public class CommonUtil {
    public static void toast(String str) {
        Toast.makeText(MyApplication.context, str, Toast.LENGTH_SHORT).show();
    }
}
