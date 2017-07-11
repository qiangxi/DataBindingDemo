package com.qiangxi.databindingdemo.acitivity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.qiangxi.databindingdemo.R;
import com.qiangxi.databindingdemo.databinding.ActivityConversionDemoBinding;

public class ConversionDemoActivity extends AppCompatActivity {
    private ActivityConversionDemoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_conversion_demo);
        binding.setIsTrue(true);
    }
}
