package com.dou361.kitkatstatusbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * ========================================
 * <p>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p>
 * 作 者：陈冠明
 * <p>
 * 个人网站：http://www.dou361.com
 * <p>
 * 版 本：1.0
 * <p>
 * 创建日期：2016/3/30 11:36
 * <p>
 * 描 述：沉浸式状态栏，该方式只适用于没有ActionBar的Activity中，状态栏的高度是20dp
 * 需要自定义标题栏，标题栏设置了clipToPadding、fitsSystemWindows属性状态栏随着标题栏背景色改变而改变，
 * 4.4及以上版本，Activity布局填满整个屏幕，4.4以下版本，Activity布局填满除状态栏外的布局。
 * 因此，标题栏高度要对应做调整，4.4以上版本 标题栏高度68dp pandingTop 20dp,4.4以下版本 标题栏高度48dp pandingTop 0dp
 * <p>
 * <p>
 * 修订历史：
 * <p>
 * ========================================
 */
public class MainActivity extends Activity {

    @Bind(R.id.btn_01)
    Button btn01;
    @Bind(R.id.btn_02)
    Button btn02;
    @Bind(R.id.btn_03)
    Button btn03;
    @Bind(R.id.btn_04)
    Button btn04;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        StatusBarCompat.compat(this, getResources().getColor(R.color.colorPrimaryDark));
    }

    @OnClick({R.id.btn_01, R.id.btn_02, R.id.btn_03, R.id.btn_04})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                StatusBarCompat.compat(this, getResources().getColor(R.color.bg1));
                break;
            case R.id.btn_02:
                StatusBarCompat.compat(this, getResources().getColor(R.color.bg2));
                break;
            case R.id.btn_03:
                StatusBarCompat.compat(this, getResources().getColor(R.color.bg3));
                break;
            case R.id.btn_04:
                StatusBarCompat.compat(this, getResources().getColor(R.color.bg4));
                break;
        }
    }
}
