package com.qiangxi.databindingdemo.databinding.conversion;

import android.databinding.BindingConversion;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;

/**
 * Created by 任强强 on 2017/7/11.
 * 自定义转换器
 */

public class CustomConversion {
    @BindingConversion
    public static ColorDrawable convertColorDrawable01(int color) {
        int i = 0;
        i++;
        return new ColorDrawable(0x12356641);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable02(int color) {
        int i = 0;
        i++;
        Log.e("tag", "i=" + i);
        return new ColorDrawable(0x41124610);
    }

    @BindingConversion
    public static ColorDrawable convertColorToDrawable03(int color) {
        return new ColorDrawable(0x65789951);
    }
}
