package com.qiangxi.databindingdemo.acitivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qiangxi.databindingdemo.R;
import com.qiangxi.databindingdemo.databinding.ActivityTwoWayBindingBinding;
import com.qiangxi.databindingdemo.entity.User01;
import com.qiangxi.databindingdemo.entity.User02;

public class TwoWayBindingActivity extends AppCompatActivity {
    User01 mUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTwoWayBindingBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
//        mUser = new User01();
//        mUser.setName("张三");
//        binding.setUser(mUser);

        User02 user02 = new User02();
        user02.age.set(5);
        int i = user02.age.get();
    }
}
