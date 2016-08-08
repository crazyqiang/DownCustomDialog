package org.ninetripods.mq.custompopupwindow.popup;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.RelativeLayout;

import org.ninetripods.mq.custompopupwindow.R;
import org.ninetripods.mq.custompopupwindow.util.AnimationUtil;
import org.ninetripods.mq.custompopupwindow.util.CommonUtil;

/**
 * Created by MQ on 2016/7/29.
 */
public class PopupWindowFromDown extends BasePopupWindow implements View.OnClickListener {
    private Button btn_take_photo, btn_select_photo, btn_cancel;
    private View view;
    private RelativeLayout pop_layout;

    public PopupWindowFromDown(Activity context) {
        super(context);
        initEvents();
    }

    private void initEvents() {
        pop_layout = (RelativeLayout) view.findViewById(R.id.pop_layout);
        btn_take_photo = (Button) view.findViewById(R.id.btn_take_photo);
        btn_select_photo = (Button) view.findViewById(R.id.btn_select_photo);
        btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
        btn_take_photo.setOnClickListener(this);
        btn_select_photo.setOnClickListener(this);
        btn_cancel.setOnClickListener(this);
        // mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
        pop_layout.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    dismissPopupWindow();
                }
                return true;
            }
        });
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take_photo:
                CommonUtil.toast("btn_take_photo From PopupWindow");
                dismissPopupWindow();
                break;
            case R.id.btn_select_photo:
                CommonUtil.toast("btn_select_photo From PopupWindow");
                dismissPopupWindow();
                break;
            case R.id.btn_cancel:
                CommonUtil.toast("cancel From PopupWindow");
                dismissPopupWindow();
                break;
        }
    }

    @Override
    protected View getPopupWindow() {
        view = LayoutInflater.from(mContext).inflate(R.layout.popwindow_from_custom, null);
        return view;
    }

    @Override
    protected Animation getShowAnimation() {
        return AnimationUtil.getTranslateAnimation(0, 0, 400, 0, 200);
    }

    @Override
    protected Animation getDissmissAnimation() {
        return null;
    }
}
