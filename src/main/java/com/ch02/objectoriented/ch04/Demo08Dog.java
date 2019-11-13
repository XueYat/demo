package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/21 19:58
 */
public class Demo08Dog extends Demo08Pet{
    String strain;

    Demo08Dog(String name, int health, int love, String strain){
        super(name, health, love);
        this.strain = strain;
    }

    @Override
    void info() {
        super.info();
        System.out.println("我是一只" + this.strain);
    }

    @Override
    void care() {
        super.care();
        System.out.println("狗狗打针，吃药");
    }
}
