package com.dou361.jjdxm_statusbar;

import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.dou361.statusbar.StatusBarUtil;

import butterknife.Bind;
import butterknife.OnClick;


public class TwoActivity extends BaseActivity {

    @Bind(R.id.ll_status)
    LinearLayout ll_status;
    @Bind(R.id.ll_content)
    LinearLayout ll_content;
    @Bind(R.id.toolbar)
    Toolbar mToolbar;
    @Bind(R.id.btn_01)
    Button btn01;
    @Bind(R.id.tv_discribe)
    TextView tv_discribe;

    @Override
    protected void initView() {
        setContentView(R.layout.activity_two);
        mToolbar.setTitle("第二个子界面");
        tv_discribe.setText("使用Toolbar，设置颜色值  setTranslucentForImageView");
        mToolbar.setNavigationIcon(R.mipmap.ic_back);
        mToolbar.setBackgroundColor(getResources().getColor(R.color.bg2));
        ll_status.setBackgroundColor(getResources().getColor(R.color.bg2));
        setSupportActionBar(mToolbar);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void setStatusBarColor() {
        StatusBarUtil.setTranslucentForImageView(TwoActivity.this, ll_content);
    }

    @OnClick({R.id.btn_01})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_01:
                startActivity(ThreeActivity.class);
                break;
        }
    }
}
