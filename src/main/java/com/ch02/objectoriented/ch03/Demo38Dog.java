package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/20 20:52
 */
public class Demo38Dog extends Demo38Pet{
    public Demo38Dog(String name, int type, int sex, int health, int love){
        super();
        this.name = name;
        this.type = type;
        this.sex = sex;
        this.health = health;
        this.love = 0;
        if (getType() == 1){
            if (getSex() == 1){
                System.out.println("我的名字叫：" + getName() + "，是一只狗狗，性别是狗哥，健康值是" + getHealth() + "，和主人的亲密度是" + getLove());
            }else {
                System.out.println("我的名字叫：" + getName() + "，是一只狗狗，性别是狗妹，健康值是" + getHealth() + "，和主人的亲密度是" + getLove());
            }
        }
    }
}
