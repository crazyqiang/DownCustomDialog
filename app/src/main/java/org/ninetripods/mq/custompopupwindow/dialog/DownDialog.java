package org.ninetripods.mq.custompopupwindow.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import org.ninetripods.mq.custompopupwindow.R;
import org.ninetripods.mq.custompopupwindow.util.CommonUtil;

/**
 * Created by MQ on 2016/8/6.
 */
public class DownDialog extends Dialog implements View.OnClickListener {
    private Button btn_take_photo, btn_select_photo, btn_cancel;

    public DownDialog(Context context) {
        this(context, R.style.option_dialog);
    }

    public DownDialog(Context context, int themeResId) {
        super(context, themeResId);
        View view = LayoutInflater.from(context).inflate(R.layout.popwindow_from_custom, null);
        initView(view);
        initListener();
        setContentView(view);
        getWindow().getDecorView().setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
//                if(mDialogClickListener!=null){
//                    mDialogClickListener.onClick(R.id.btn_cancel);
//                }
                dismiss();
                return true;
            }
        });
    }

    private void initListener() {
        btn_cancel.setOnClickListener(this);
        btn_take_photo.setOnClickListener(this);
        btn_select_photo.setOnClickListener(this);
    }

    private void initView(View view) {
        btn_take_photo = (Button) view.findViewById(R.id.btn_take_photo);
        btn_select_photo = (Button) view.findViewById(R.id.btn_select_photo);
        btn_cancel = (Button) view.findViewById(R.id.btn_cancel);
    }

    @SuppressWarnings("deprecation")
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setGravity(Gravity.BOTTOM);
        WindowManager m = getWindow().getWindowManager();
        Display d = m.getDefaultDisplay();
        WindowManager.LayoutParams p = getWindow().getAttributes();
        p.width = d.getWidth();
        getWindow().setAttributes(p);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_take_photo:
                CommonUtil.toast("btn_take_photo From Dialog");
                break;
            case R.id.btn_select_photo:
                CommonUtil.toast("btn_select_photo From Dialog");
                break;
            case R.id.btn_cancel:
                CommonUtil.toast("cancel From Dialog");
                break;
        }
        dismiss();
    }

}
