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


        //测试git的检出和提交
        String str = "我是谁";

        //测试git提交时项目冲突的解决方法
        String s3 = "你是谁，管你是谁，提交项目";
        //测试git提交时项目冲突的解决方法4
        String s4 = "你是谁4，管你是谁4，提交项目4";

       // ButterKnife.bind(this);
       // Activity

        //测试git提交时项目冲突的解决方法5
        String s5 = "你是谁5，管你是谁5，提交项目5";

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
