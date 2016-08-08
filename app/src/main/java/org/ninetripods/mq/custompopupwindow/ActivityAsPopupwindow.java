package org.ninetripods.mq.custompopupwindow;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import org.ninetripods.mq.custompopupwindow.util.CommonUtil;

public class ActivityAsPopupwindow extends AppCompatActivity implements View.OnClickListener {
    private Button btn_take_photo, btn_select_photo, btn_cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow_from_custom);
        initViews();
        initEvents();
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth();
        getWindow().setAttributes(p);
    }


    private void initEvents() {
        //添加按钮监听
        btn_cancel.setOnClickListener(this);
        btn_take_photo.setOnClickListener(this);
        btn_select_photo.setOnClickListener(this);
    }

    private void initViews() {
        btn_take_photo = (Button) findViewById(R.id.btn_take_photo);
        btn_select_photo = (Button) findViewById(R.id.btn_select_photo);
        btn_cancel = (Button) findViewById(R.id.btn_cancel);
    }

    //实现onTouchEvent触屏函数但点击屏幕时销毁本Activity
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        finish();
        return true;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take_photo:
                CommonUtil.toast("btn_take_photo From Activity");
                finish();
                break;
            case R.id.btn_select_photo:
                CommonUtil.toast("btn_select_photo From Activity");
                finish();
                break;
            case R.id.btn_cancel:
                CommonUtil.toast("cancel From Activity");
                finish();
                break;
        }
    }
}
