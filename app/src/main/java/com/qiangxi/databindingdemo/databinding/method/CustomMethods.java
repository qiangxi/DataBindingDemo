package com.qiangxi.databindingdemo.databinding.method;
/*
 * Copyright @2017 甘肃诚诚网络技术有限公司 All rights reserved.
 * 甘肃诚诚网络技术有限公司 专有/保密源代码,未经许可禁止任何人通过任何
 * 渠道使用、修改源代码.
 * 日期 2017/7/12 9:37
 */

import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.widget.TextView;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @project: DataBindingDemo
 * @package: com.qiangxi.databindingdemo.databinding.method
 * @version: V1.0
 * @author: 任强强
 * @date: 2017/7/12 9:37
 * @description: <p>
 * <p>
 * 自定义方法
 * </p>
 */
@BindingMethods({
        @BindingMethod(type = TextView.class, attribute = "android:textAllCaps", method = "setAllCaps"),
})
public class CustomMethods {

}
