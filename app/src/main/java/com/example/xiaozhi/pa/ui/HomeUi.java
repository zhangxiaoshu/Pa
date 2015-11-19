package com.example.xiaozhi.pa.ui;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.xiaozhi.pa.R;
import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;


public class HomeUi extends AppCompatActivity {

    @ViewInject(R.id.home_fl_container)
    private FrameLayout mFlContainer;

    @ViewInject(R.id.home_rg_menu)
    private RadioGroup mRgMenu;
    private FragmentManager mFm;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_ui);


        ViewUtils.inject(this);

        //  mRgMenu = (RadioGroup) findViewById(R.id.home_rg_menu);

        //事件初始化
        initEvent();

        //获取fragment的管理者
        mFm = getFragmentManager();
    }

    private void initEvent() {
        mRgMenu.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.tab_rb_home:
                       // Toast.makeText(HomeUi.this, checkedId + "", Toast.LENGTH_SHORT).show();

                        break;
                    case R.id.tab_rb_order:
                        Toast.makeText(HomeUi.this, checkedId + "", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.tab_rb_my:
                       // WindowManager
                        Toast.makeText(HomeUi.this, checkedId + "", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        });
    }
}
