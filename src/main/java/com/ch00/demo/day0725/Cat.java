package com.ch00.demo.day0725;

public class Cat extends Pet{

    public Cat(String name, int love,  int health) {
        setName(name);
        setLove(love);
        setHealth(health);
    }

    @Override
    public void eat() {
        if(getHealth() < 60){
            setHealth(getHealth() + 3);
            System.out.println("吃鱼，健康值为：" + getHealth());
            show();
        }
    }
}