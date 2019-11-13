package com.ch00.demo.day0726test;

public class SportBasketball extends Sporter{

    public SportBasketball(String name){
        setName(name);
    }

    @Override
    public void print() {
        System.out.println("篮球队员" + getName() + "不需要学习英文！");
    }
}
