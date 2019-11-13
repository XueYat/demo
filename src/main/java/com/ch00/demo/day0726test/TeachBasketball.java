package com.ch00.demo.day0726test;

public class TeachBasketball extends Teach{

    public TeachBasketball(String name){
        setName(name);
    }

    @Override
    public void print() {
        System.out.println("篮球教练" + getName() + "不需要学习英文！");
    }
}
