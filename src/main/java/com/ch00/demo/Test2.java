package com.ch00.demo;

/**
 * @author YatXue
 * @date 2019/3/22 8:45
 */
public class Test2 {
    //this, super关键字不能出现在static方法中
    static void a1(){
        System.out.println("a1");
        a2();
        //Test2 test2 = new Test2();
        //test2.b1();
        //test2.b2();
    }

    static void a2(){
        System.out.println("a2");
        //a1();
        Test2 test2 = new Test2();
        test2.b1();
        //test2.b2();
    }

    void b1(){
        System.out.println("b1");
        //a1();
        //a2();
        //b2();
        this.b2();
    }

    void b2(){
        System.out.println("b2");
        //a1();
        //a2();
        //b1();
        //this.b1();
    }

    static {
        System.out.println("static");
    }

    {
        System.out.println("default");
    }

    public static void main(String[] args) {
        a1();
    }
}
