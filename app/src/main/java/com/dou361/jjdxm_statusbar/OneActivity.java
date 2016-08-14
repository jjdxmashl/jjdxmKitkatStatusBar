package com.dou361.jjdxm_statusbar;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dou361.statusbar.StatusBarUtil;

import butterknife.Bind;
import butterknife.OnClick;


public class OneActivity extends BaseActivity {

    @Bind(R.id.main_title_bar)
    LinearLayout main_title_bar;
    @Bind(R.id.ll_content)
    LinearLayout ll_content;
    @Bind(R.id.tv_title)
    TextView tv_title;
    @Bind(R.id.tv_discribe)
    TextView tv_discribe;
    @Bind(R.id.btn_01)
    Button btn01;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_one);
        main_title_bar.getBackground().setAlpha(0);
        tv_title.setText("第一个子界面");
        tv_discribe.setText("使用自定义标题栏，图片或者背景顶到状态栏  setTranslucentForImageView");
    }

    @Override
    protected void setStatusBarColor() {
        StatusBarUtil.setTranslucentForImageView(OneActivity.this, ll_content);
    }

    @OnClick({R.id.btn_01, R.id.iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                startActivity(TwoActivity.class);
                break;
            case R.id.iv_back:
                finish();
                break;
        }
    }
}
