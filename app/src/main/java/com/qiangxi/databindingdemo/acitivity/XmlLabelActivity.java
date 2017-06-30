package com.qiangxi.databindingdemo.acitivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.qiangxi.databindingdemo.R;
import com.qiangxi.databindingdemo.databinding.ActivityXmlLabelBinding;

/**
 * xml标签详解
 * layout:
 * data:class(可选)
 * variable:type(必填)/name(必填)
 * import:type(必填)/alias(可选)
 */
public class XmlLabelActivity extends AppCompatActivity {
    private ActivityXmlLabelBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_xml_label);
        mBinding.setPresenter(this);
    }


    public void onViewClick(){

    }
}
