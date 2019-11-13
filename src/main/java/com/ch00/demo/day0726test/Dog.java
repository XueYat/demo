package com.ch00.demo.day0726test;
import com.ch00.demo.day0726test.impl.*;

public class Dog extends Pet implements Eatable, FlyingDiscCatchable{

    public Dog(String name, int health, int love){
        setName(name);
        setHealth(health);
        setLove(love);
    }

    @Override
    public void eat() {
        System.out.print("吃肉");
    }

    @Override
    public void catchingFlyDisc() {
        System.out.print("，玩飞盘");
    }

    @Override
    public void print() {
        System.out.print("我的名字叫：" + getName() + "，健康值是：" + getHealth() + "，和主人的亲密度是：" + getLove() + "，我喜欢");
        eat();
        catchingFlyDisc();
    }
}
