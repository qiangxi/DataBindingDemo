package com.qiangxi.databindingdemo.entity;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class User extends BaseObservable {

    private String name;
    private int age;
    private String sex;
    private boolean isStudent;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(com.qiangxi.databindingdemo.BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(com.qiangxi.databindingdemo.BR.age);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        notifyPropertyChanged(com.qiangxi.databindingdemo.BR.sex);
    }

    @Bindable
    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
        notifyPropertyChanged(com.qiangxi.databindingdemo.BR.student);
    }

    @Bindable({"name", "age", "sex", "isStudent"})
    public String getAll() {
        return "姓名:" + name + ",年龄=" + age + "，性别：" + sex + "，是不是学生=" + isStudent;
    }
}
