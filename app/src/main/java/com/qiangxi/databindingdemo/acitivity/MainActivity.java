package com.qiangxi.databindingdemo.acitivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qiangxi.databindingdemo.R;
import com.qiangxi.databindingdemo.databinding.ActivityMainBinding;

/**
 * @author qiangxi
 *         DataBinding的基本使用
 */
public class MainActivity extends AppCompatActivity {
    //    private TextView mTextView;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        mTextView = (TextView) findViewById(R.id.textView);
//        mTextView.setText("DataBinding的基本使用");
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        mBinding.textView.setText("DataBinding的基本使用");
    }
}
