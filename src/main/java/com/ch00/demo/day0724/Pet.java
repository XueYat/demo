package com.ch00.demo.day0724;

public abstract class Pet {
    private String name;
    private int helth;
    private int love;

    public abstract void print();

    /*public void print(String name, int helth, int love){
        this.name = name;
        this.helth = helth;
        this.love = love;
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + name + "，我的健康值是：" + helth + "，我和主人的亲密度是" + love);
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setHelth(int helth) {
        this.helth = helth;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public String getName() {
        return name;
    }

    public int getHelth() {
        return helth;
    }

    public int getLove() {
        return love;
    }

}
