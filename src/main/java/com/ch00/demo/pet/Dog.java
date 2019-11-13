package com.ch00.demo.pet;

public class Dog {
    private String name, varieties;
    private int helth = 100, love = 0;

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        if(helth < 0){
            this.helth = 60;
            System.out.println("健康值小于0，默认为60");
        }else{
            this.helth = helth;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVarieties() {
        return varieties;
    }

    public void setVarieties(String varieties) {
        this.varieties = varieties;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public Dog(){

    }

    public Dog(String name, String varieties){
        this.name = name;
        this.varieties = varieties;
    }

    public void intro(){
        System.out.println("我的名字叫" + name + "，健康值是：" + helth + "，和主人亲密度为：" + love + "，我是一只" + varieties);
    }
}
