package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/21 19:58
 */
public class Demo08Pet {
    String name;
    int health;
    int love;

    Demo08Pet(){

    }

    Demo08Pet(String name, int health, int love){
        this.name = name;
        this.health = health;
        this.love = love;
    }

    void care(){

    }

    void info(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + this.name + "，我的健康值为：" + this.health + "，和主人的亲密度为：" + this.love);
    }
}
