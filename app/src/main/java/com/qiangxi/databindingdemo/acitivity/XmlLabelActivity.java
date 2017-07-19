package com.qiangxi.databindingdemo.acitivity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.qiangxi.databindingdemo.R;
import com.qiangxi.databindingdemo.constants.AppConstants;
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
//        mBinding.setOrderTypeCode(AppConstants.ORDER_TYPE_1);
    }


    public void onViewClick() {

    }

    public void click(View view) {
        mBinding.setOrderTypeCode(AppConstants.ORDER_TYPE_3);
    }

    public void click01(View view) {
        Log.e("tag", "code=" + mBinding.getOrderTypeCode());
    }

    public void click02(View view) {
        mBinding.textView.setText("半日租");
    }
}
