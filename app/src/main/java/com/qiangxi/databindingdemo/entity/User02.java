package com.qiangxi.databindingdemo.entity;

import android.databinding.ObservableBoolean;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;

public class User02 {
    public final ObservableField<String> name = new ObservableField<>();
    public final ObservableInt age = new ObservableInt();
    public final ObservableField<String> sex = new ObservableField<>();
    public final ObservableBoolean isStudent = new ObservableBoolean();
}
