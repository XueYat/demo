package com.ch00.demo;

/**
 * @author YatXue
 * @date 2019/3/18 17:16
 */
class HelloB extends HelloA{
    //构造方法
    public HelloB(){
        System.out.println("HelloB");
    }

    //非静态代码块
    {
        System.out.println("I am B class");
    }

    //静态代码块
    static {
        System.out.println("static B");
    }

    /**
     * 运行输出结果是：
     * 静态代码块！-->非静态代码块！-->默认构造方法！-->普通方法中的代码块！
     * 非静态代码块！-->默认构造方法！-->普通方法中的代码块！
     */

    /**
     * 一般情况下,如果有些代码必须在项目启动的时候就执行的时候,需要使用静态代码块,这种代码是主动执行的;
     * 需要在项目启动的时候就初始化,在不创建对象的情况下,其他程序来调用的时候,需要使用静态方法,这种代码是被动执行的.
     * 两者的区别就是:静态代码块是自动执行的;
     * 静态方法是被调用的时候才执行的.
     * 作用:静态代码块可用来初始化一些项目最常用的变量或对象;静态方法可用作不创建对象也可能需要执行的代码.
     *
     */
    public static void main(String[] args) {
        System.out.println("----------main start----------");
        new HelloA();
        System.out.println("------------------------------");
        new HelloB();
        System.out.println("-----------main end-----------");

    }
}
