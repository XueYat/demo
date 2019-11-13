package com.ch02.objectoriented.test;

/**
 * @author YatXue
 * @date 2019/3/13 16:00
 */
public class Dog extends Pet{
    @Override
    public void eat() {
        super.eat();
        System.out.println("狗粮");
    }
}
