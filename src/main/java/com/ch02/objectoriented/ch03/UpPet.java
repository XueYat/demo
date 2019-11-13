package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/22 10:59
 */
public class UpPet {
    String name;
    int sex;
    int health;
    int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health > 0 && health <= 100){
            this.health = health;
        }else {
            System.out.println("健康值在1-100之间，默认60");
            this.health = 60;
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    void show(){
        System.out.println("宠物的自白：");
        System.out.print("我的名字叫" + getName() + "，健康值为" + getHealth() + "，和主人的亲密度为" + getLove());
    }
}
