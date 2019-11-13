package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/20 20:53
 */
public class Demo38Penguin extends Demo38Pet{
    public Demo38Penguin(String name, int type, int sex, int health, int love){
        super();
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.health = health;
        this.love = 0;
        if (getType() == 2){
            if (getSex() == 1){
                System.out.println("我的名字叫：" + getName() + "，是一只企鹅，性别是Q仔，健康值是" + getHealth() + "，和主人的亲密度是" + getLove());
            }else {
                System.out.println("我的名字叫：" + getName() + "，是一只企鹅，性别是Q妹，健康值是" + getHealth() + "，和主人的亲密度是" + getLove());
            }
        }
    }
}