package com.dou361.jjdxm_statusbar;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dou361.statusbar.StatusBarUtil;

import butterknife.Bind;
import butterknife.OnClick;

/**
 * ========================================
 * <p/>
 * 版 权：dou361.com 版权所有 （C） 2015
 * <p/>
 * 作 者：陈冠明
 * <p/>
 * 个人网站：http://www.dou361.com
 * <p/>
 * 版 本：1.0
 * <p/>
 * 创建日期：2016/3/30 11:36
 * <p/>
 * 描 述：沉浸式状态栏，该方式只适用于没有ActionBar的Activity中，状态栏的高度是20dp
 * 需要自定义标题栏，标题栏设置了clipToPadding、fitsSystemWindows属性状态栏随着标题栏背景色改变而改变，
 * 4.4及以上版本，Activity布局填满整个屏幕，4.4以下版本，Activity布局填满除状态栏外的布局。
 * 因此，标题栏高度要对应做调整，4.4以上版本 标题栏高度68dp pandingTop 20dp,4.4以下版本 标题栏高度48dp pandingTop 0dp
 * <p/>
 * <p/>
 * 修订历史：
 * <p/>
 * ========================================
 */
public class MainActivity extends BaseActivity {

    @Bind(R.id.main_title_bar)
    LinearLayout main_title_bar;
    @Bind(R.id.iv_back)
    ImageView iv_back;
    @Bind(R.id.tv_title)
    TextView tv_title;
    @Bind(R.id.tv_discribe)
    TextView tv_discribe;
    @Bind(R.id.btn_01)
    Button btn01;
    @Bind(R.id.btn_02)
    Button btn02;
    @Bind(R.id.btn_03)
    Button btn03;
    @Bind(R.id.btn_04)
    Button btn04;
    @Bind(R.id.btn_05)
    Button btn05;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_main);
        iv_back.setVisibility(View.GONE);
        tv_title.setText("首页");
        /**
         * 注意使用的主题样式为
         * <style name="BaseAppTheme" parent="Theme.AppCompat.Light.DarkActionBar">
         <item name="android:textAllCaps">false</item>
         <item name="android:windowActionBar">false</item>
         <item name="windowActionBar">false</item>
         <item name="windowNoTitle">true</item>
         <item name="colorPrimary">@color/colorPrimary</item>
         <item name="colorPrimaryDark">@color/colorPrimaryDark</item>
         <item name="colorAccent">@color/colorAccent</item>
         </style>
         *
         * */
        tv_discribe.setText("使用自定义标题栏，设置颜色值");
    }

    @Override
    protected boolean openSliding() {
        return false;
    }

    @OnClick({R.id.btn_01, R.id.btn_02, R.id.btn_03, R.id.btn_04, R.id.btn_05})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                main_title_bar.setBackgroundColor(getResources().getColor(R.color.bg1));
                StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg1));
                break;
            case R.id.btn_02:
                main_title_bar.setBackgroundColor(getResources().getColor(R.color.bg2));
                StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg2));
                break;
            case R.id.btn_03:
                main_title_bar.setBackgroundColor(getResources().getColor(R.color.bg3));
                StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg3));
                break;
            case R.id.btn_04:
                main_title_bar.setBackgroundColor(getResources().getColor(R.color.bg4));
                StatusBarUtil.setColorNoTranslucent(this, getResources().getColor(R.color.bg4));
                break;
            case R.id.btn_05:
                startActivity(OneActivity.class);
                break;
        }
    }
}
