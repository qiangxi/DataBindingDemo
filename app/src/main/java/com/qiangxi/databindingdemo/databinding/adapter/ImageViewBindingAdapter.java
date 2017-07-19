package com.qiangxi.databindingdemo.databinding.adapter;
/*
 * Copyright @2017 甘肃诚诚网络技术有限公司 All rights reserved.
 * 甘肃诚诚网络技术有限公司 专有/保密源代码,未经许可禁止任何人通过任何
 * 渠道使用、修改源代码.
 * 日期 2017/6/19 16:20
 */

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @project: CCZC
 * @package: com.chengcheng.zhuanche.customer.databinding.adapter
 * @version: V1.0
 * @author: 任强强
 * @date: 2017/6/19 16:20
 * @description: <p>
 * <p>ImageView绑定适配器
 * </p>
 */

public class ImageViewBindingAdapter {

    /**
     * 为imageView设置url,placeHolder,error
     */
    @BindingAdapter(value = {"android:imageUrl", "android:placeHolder", "android:error"}, requireAll = false)
    public static void loadImage(ImageView imageView, String url, Drawable placeHolder, Drawable error) {
//        ImageLoader.bind(imageView, url, placeHolder, error, true, DiskCacheStrategy.ALL, null);
    }
}
