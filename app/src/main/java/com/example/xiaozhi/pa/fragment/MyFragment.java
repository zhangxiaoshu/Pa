package com.example.xiaozhi.pa.fragment;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by xiaozhi on 2015/11/17.
 */
public class MyFragment extends BaseFragment {
    @Override
    protected View initView() {
        TextView tv = new TextView(mContext);
        tv.setText("我的");
        tv.setTextSize(30);
        tv.setGravity(Gravity.CENTER);
        return tv;
    }
}
