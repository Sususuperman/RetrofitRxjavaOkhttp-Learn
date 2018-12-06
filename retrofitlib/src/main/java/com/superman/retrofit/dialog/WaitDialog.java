package com.superman.retrofit.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.superman.com.retrofitlib.R;


/**
 * Created by weifei on 17/1/9.
 */

public class WaitDialog extends Dialog {

    private boolean dialogShow;
    public WaitDialog(Context context, String msg) {
        this(context,msg,false,false);
    }
    public WaitDialog(Context context, String msg, boolean status, boolean dialogShow) {
        super(context, R.style.loading_dialog);
        this.dialogShow = dialogShow;

        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.layout_loading, null);// 得到加载view
        LinearLayout layout = (LinearLayout) v.findViewById(R.id.dialog_view);// 加载布局
        // main.xml中的ImageView
        TextView tipTextView = (TextView) v.findViewById(R.id.tipTextView);// 提示文字
        // 使用ImageView显示动画
        tipTextView.setText(msg);// 设置加载信息
        setOnKeyListener(keylistener);
        setCancelable(status);
        setContentView(layout, new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.FILL_PARENT,
                LinearLayout.LayoutParams.FILL_PARENT));
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        dialogShow = false;
    }

    // 拦截到屏幕触摸事件，禁止分发
    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return false;
    }


    OnKeyListener keylistener = new OnKeyListener() {
        @Override
        public boolean onKey(DialogInterface dialog, int keyCode, KeyEvent event) {
            if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0) {
                return !dialogShow;
            } else {
                return false;
            }
        }
    };
}
