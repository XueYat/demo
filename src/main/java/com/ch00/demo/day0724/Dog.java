package com.ch00.demo.day0724;

public class Dog extends Pet{
    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void print() {
        System.out.println("宠物的自白：");
        System.out.println("我的名字叫" + getName() + "，我的健康值是：" + getHelth() + "，我和主人的亲密度是" + getLove());
        System.out.println("我是一只" + getStrain());
    }



    /*@Override
    public void print(String name, int helth, int love) {
        super.print(name, helth, love);
        System.out.println("我是一只" + getStrain());
    }*/
}
