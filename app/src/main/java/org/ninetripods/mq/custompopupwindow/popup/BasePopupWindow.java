package org.ninetripods.mq.custompopupwindow.popup;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.PopupWindow;

import org.ninetripods.mq.custompopupwindow.R;

/**
 * Created by MQ on 2016/7/29.
 */
public abstract class BasePopupWindow extends PopupWindow {
    protected View mPopupView;
    protected Activity mContext;
    protected Animation showAnimation, dismissPopupWindow;

    public BasePopupWindow() {
        super();
    }

    public BasePopupWindow(Activity context) {
        initSet(context, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
    }

    public BasePopupWindow(Activity context, int width, int height) {
        initSet(context, width, height);
    }

    private void initSet(Activity context, int width, int height) {
        mContext = context;
        mPopupView = getPopupWindow();
//        mPopupView.setFocusableInTouchMode(true);
        //实例化一个ColorDrawable颜色为半透明
        ColorDrawable cd = new ColorDrawable(0xb0000000);
        setContentView(mPopupView);
        this.setWidth(width);
        this.setHeight(height);
        this.setBackgroundDrawable(cd);
        this.setOutsideTouchable(true);
        this.setFocusable(true);
//        setAnimationStyle(R.style.AnimBottom);
        showAnimation = getShowAnimation();
        dismissPopupWindow = getDissmissAnimation();
    }

    protected abstract View getPopupWindow();

    protected abstract Animation getShowAnimation();

    protected abstract Animation getDissmissAnimation();

    public View findViewById(int id) {
        return mPopupView.findViewById(id);
    }

    public void showPopupWindow() {
        showAtLocation(mContext.findViewById(android.R.id.content), Gravity.BOTTOM, 0, 0);
        if (showAnimation != null) {
            mPopupView.clearAnimation();
            mPopupView.startAnimation(showAnimation);
        }
    }

    public void dismissPopupWindow() {
        dismiss();
        if (dismissPopupWindow != null) {
            mPopupView.clearAnimation();
            mPopupView.startAnimation(dismissPopupWindow);
        }
    }
}
