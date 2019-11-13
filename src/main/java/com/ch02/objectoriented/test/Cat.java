package com.ch02.objectoriented.test;

/**
 * @author YatXue
 * @date 2019/3/13 16:00
 */
class Cat extends Pet{
    @Override
    void eat() {
        super.eat();
        System.out.print("猫粮");
    }

    void info(String type, String barking, int legs, String color){
        this.setType(type);
        this.setBarking(barking);
        this.setLegs(legs);
        this.setColor(color);
    }
}
