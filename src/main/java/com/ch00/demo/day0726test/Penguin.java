package com.ch00.demo.day0726test;
import com.ch00.demo.day0726test.impl.*;

public class Penguin extends Pet implements Eatable, Swimmable{

    public Penguin(String name, int health, int love){
        setName(name);
        setHealth(health);
        setLove(love);
    }

    @Override
    public void eat() {
        System.out.print("吃鱼");
    }

    @Override
    public void swim() {
        System.out.print("，游泳");
    }


    @Override
    public void print() {
        System.out.print("我的名字叫：" + getName() + "，健康值是：" + getHealth() + "，和主人的亲密度是：" + getLove() + "，我喜欢");
        eat();
        swim();
    }
}
