package org.ninetripods.mq.custompopupwindow;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.ninetripods.mq.custompopupwindow.dialog.DownDialog;
import org.ninetripods.mq.custompopupwindow.popup.PopupWindowFromDown;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private PopupWindowFromDown downWindow;
    private Button btn_popup, btn_activity, btn_dialog;
    private DownDialog downDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initEvents();
    }


    private void initViews() {
        btn_popup = (Button) findViewById(R.id.btn_popup);
        btn_activity = (Button) findViewById(R.id.btn_activity);
        btn_dialog = (Button) findViewById(R.id.btn_dialog);
        downWindow = new PopupWindowFromDown(this);
        downDialog = new DownDialog(this);
    }

    private void initEvents() {
        btn_popup.setOnClickListener(this);
        btn_activity.setOnClickListener(this);
        btn_dialog.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_popup:
                downWindow.showPopupWindow();
                break;
            case R.id.btn_activity:
                startActivity(new Intent(this, ActivityAsPopupwindow.class));
                break;
            case R.id.btn_dialog:
                if (downDialog != null) {
                    downDialog.show();
                }
                break;
        }
    }
}
