package com.qiangxi.databindingdemo.entity;

import android.databinding.Bindable;
import android.databinding.Observable;
import android.databinding.PropertyChangeRegistry;

import com.qiangxi.databindingdemo.BR;

public class User01 implements Observable {
    private PropertyChangeRegistry registry = new PropertyChangeRegistry();

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
        registry.notifyChange(this, BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        registry.notifyChange(this, BR.age);
    }

    @Bindable
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        registry.notifyChange(this, BR.sex);
    }

    @Bindable
    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
        registry.notifyChange(this, BR.student);
    }

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        registry.add(callback);
    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {
        registry.remove(callback);
    }
}
