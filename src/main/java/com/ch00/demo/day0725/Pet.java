package com.ch00.demo.day0725;

public abstract class Pet {
    private String name;
    private int health;
    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health >= 60){
            this.health = health;
            System.out.println("宠物不用进食！");
        }else{
            this.health = health;
        }
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public abstract void eat();

    public void show(){
        System.out.println("我的名字叫：" + getName() + "，和主人的亲密度是：" + getLove() + "，健康值是：" + getHealth());
    }
}
