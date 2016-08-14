package com.dou361.jjdxm_statusbar;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dou361.statusbar.StatusBarUtil;

import butterknife.Bind;
import butterknife.OnClick;

public class ThreeActivity extends BaseActivity {

    @Bind(R.id.ll_status)
    LinearLayout ll_status;
    @Bind(R.id.ll_content)
    LinearLayout ll_content;
    @Bind(R.id.main_title_bar)
    LinearLayout main_title_bar;
    @Bind(R.id.tv_title)
    TextView tv_title;
    @Bind(R.id.tv_discribe)
    TextView tv_discribe;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_three);
        main_title_bar.setBackgroundColor(getResources().getColor(R.color.bg3));
        ll_status.setBackgroundColor(getResources().getColor(R.color.bg3));
        tv_title.setText("第三个子界面");
        tv_discribe.setText("使用自定义标题栏，设置颜色值  setTranslucentForImageView");
    }

    @Override
    protected void setStatusBarColor() {
        StatusBarUtil.setTranslucentForImageView(ThreeActivity.this, ll_content);
    }

    @OnClick({R.id.iv_back})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.iv_back:
                finish();
                break;
        }
    }

}
