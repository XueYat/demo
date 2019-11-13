package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/21 19:58
 */
public class Demo08Penguin extends Demo08Pet{
    String sex;

    Demo08Penguin(String name, int health, int love, String sex){
        super(name, health, love);
        this.sex = sex;
    }

    @Override
    void info() {
        super.info();
        System.out.println("我的性别是" + this.sex);
    }

    @Override
    void care() {
        super.care();
        System.out.println("企鹅吃药，疗养");
    }
}
