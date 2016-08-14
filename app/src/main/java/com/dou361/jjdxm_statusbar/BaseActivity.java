package com.dou361.jjdxm_statusbar;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.dou361.statusbar.StatusBarUtil;
import com.dou361.statusbar.SwipeBackLayout;

import butterknife.ButterKnife;

/**
 * Created by wei on 2016/5/30.
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (openSliding()) {
            SwipeBackLayout layout = new SwipeBackLayout(this, null);
            layout.attachToActivity(this, SwipeBackLayout.CloseMode.PRESSBACK);
        }
        initView();
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        setStatusBarColor();
        ButterKnife.bind(this);
    }

    /**
     * true 右滑关闭activity false无操作
     */
    protected boolean openSliding() {
        return true;
    }

    /**
     * 重写设置状态栏颜色
     */
    protected void setStatusBarColor() {
        StatusBarUtil.setColorNoTranslucent(BaseActivity.this, getResources().getColor(R.color.bg0));
    }

    /**
     * 初始化View
     */
    protected abstract void initView();


    protected void startActivity(Class<?> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
//        overridePendingTransition(R.anim.base_slide_right_in, R.anim.base_slide_remain);
    }
}
