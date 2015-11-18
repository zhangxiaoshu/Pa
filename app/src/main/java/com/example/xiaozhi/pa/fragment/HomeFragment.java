package com.example.xiaozhi.pa.fragment;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;


public class HomeFragment extends BaseFragment {
    @Override
    protected View initView() {
        TextView tv = new TextView(mContext);
        tv.setText("首页");
        tv.setTextSize(30);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }
}
