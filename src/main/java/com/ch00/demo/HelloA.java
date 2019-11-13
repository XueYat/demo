package com.ch00.demo;

/**
 * @author YatXue
 * @date 2019/3/18 17:16
 */
class HelloA {
    public HelloA(){
        System.out.println("HelloA");
    }

    {
        System.out.println("I am A class");
    }

    static {
        System.out.println("static A");
    }
}
