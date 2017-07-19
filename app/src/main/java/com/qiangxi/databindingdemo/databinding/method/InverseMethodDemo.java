package com.qiangxi.databindingdemo.databinding.method;
/*
 * Copyright @2017 甘肃诚诚网络技术有限公司 All rights reserved.
 * 甘肃诚诚网络技术有限公司 专有/保密源代码,未经许可禁止任何人通过任何
 * 渠道使用、修改源代码.
 * 日期 2017/7/18 16:01
 */

import android.databinding.InverseMethod;

import com.qiangxi.databindingdemo.constants.AppConstants;

/**
 * @company: 甘肃诚诚网络技术有限公司
 * @project: DataBindingDemo
 * @package: com.qiangxi.databindingdemo.databinding.method
 * @version: V1.0
 * @author: 任强强
 * @date: 2017/7/18 16:01
 * @description: <p>
 * <p>
 * </p>
 */

public class InverseMethodDemo {

    @InverseMethod("convertIntToString")
    public static int convertStringToInt(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    public static String convertIntToString(int value) {
        return String.valueOf(value);
    }

    @InverseMethod("orderTypeToString")
    public static String stringToOrderType(String value) {
        if (value == null) {
            return null;
        }
        switch (value) {
            case "立即单":
                return AppConstants.ORDER_TYPE_1;
            case "预约单":
                return AppConstants.ORDER_TYPE_2;
            case "接机单":
                return AppConstants.ORDER_TYPE_3;
            case "送机单":
                return AppConstants.ORDER_TYPE_4;
            case "半日租单":
                return AppConstants.ORDER_TYPE_5;
            case "全日租单":
                return AppConstants.ORDER_TYPE_6;
            default:
                return null;
        }
    }


    public static String orderTypeToString(String code) {
        if (code == null) {
            return null;
        }
        switch (code) {
            case AppConstants.ORDER_TYPE_1:
                return "立即单";
            case AppConstants.ORDER_TYPE_2:
                return "预约单";
            case AppConstants.ORDER_TYPE_3:
                return "接机单";
            case AppConstants.ORDER_TYPE_4:
                return "送机单";
            case AppConstants.ORDER_TYPE_5:
                return "半日租单";
            case AppConstants.ORDER_TYPE_6:
                return "全日租单";
            default:
                return null;
        }
    }
}
