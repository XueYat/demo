package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 15:57
 */
public class Demo24Penguin extends Demo24Pet{
    Demo24Penguin(String name) {
        super(name);
    }

    @Override
    void info() {
        super.info();
        System.out.println("，种类：企鹅");
    }

    @Override
    void recognition() {
        super.recognition();
    }

    void swim(){
        System.out.println("南极游泳");
    }
}
