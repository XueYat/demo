package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/20 20:52
 */
public class Demo38Pet {
    String name;
    int type;
    int sex;
    int health;
    int love;
    Demo38Pet(){
        System.out.println("宠物的自白：");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
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
        if (health >= 1 && health <= 100){
            this.health = health;
        }else {
            System.out.println("健康值在0-100之间，默认值为60");
            this.health = 60;
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }
}
