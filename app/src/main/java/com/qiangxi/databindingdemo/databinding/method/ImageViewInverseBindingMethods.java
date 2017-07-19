package com.qiangxi.databindingdemo.databinding.method;
/*
 * Copyright @2017 甘肃诚诚网络技术有限公司 All rights reserved.
 * 甘肃诚诚网络技术有限公司 专有/保密源代码,未经许可禁止任何人通过任何
 * 渠道使用、修改源代码.
 * 日期 2017/7/17 15:51
 */

import android.databinding.InverseBindingMethod;
import android.databinding.InverseBindingMethods;
import android.widget.ImageView;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @project: DataBindingDemo
 * @package: com.qiangxi.databindingdemo.databinding.adapter
 * @version: V1.0
 * @author: 任强强
 * @date: 2017/7/17 15:51
 * @description: <p>
 * <p>
 * </p>
 */


@InverseBindingMethods({@InverseBindingMethod(type = ImageView.class, attribute = "android:textAllCaps"),
        @InverseBindingMethod(type = ImageView.class, attribute = "android:textAllCaps", event = ""),
        @InverseBindingMethod(type = ImageView.class, attribute = "android:textAllCaps", method = "setAllCaps"),
        @InverseBindingMethod(type = ImageView.class, attribute = "android:textAllCaps", event = "", method = "setAllCaps"),
})
public class ImageViewInverseBindingMethods {

}
