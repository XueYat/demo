package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 15:57
 */
public class Demo24Dog extends Demo24Pet{
    Demo24Dog(String name) {
        super(name);
    }

    @Override
    void info() {
        super.info();
        System.out.println("，种类：狗狗");
    }

    @Override
    void recognition() {
        super.recognition();
    }

    void frisbee(){
        System.out.println("接飞盘");
    }
}
