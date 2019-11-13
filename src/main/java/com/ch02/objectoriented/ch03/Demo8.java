package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/19 20:00
 */
public class Demo8 {
    private String name;
    private String type;
    private String sex;
    private int health;
    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        if (type.equals("1")){
            this.type = "狗狗";
        }else {
            this.type = "企鹅";
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if (getType().equals("狗狗")){
            if (sex.equals(1)){
                this.sex = "狗哥";
            }else {
                this.sex = "狗妹";
            }
        }else {
            if (sex.equals(2)){
                this.sex = "Q仔";
            }else {
                this.sex = "Q妹";
            }
        }
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

    public void info(){
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫：" + getName() + "，是一只" + getType() + "，性别是" + getSex() + "，健康值是" + getHealth() + "，和主人的亲密度是" + getLove());
    }
}
