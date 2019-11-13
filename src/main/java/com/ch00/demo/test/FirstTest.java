package com.ch00.demo.test;

import com.ch00.demo.first.First;

public class FirstTest {
    public static void main(String[] args){
        /*Scanner sc = new Scanner(System.in);
        System.out.println("你要说什么：");
        String say = sc.next();*/
        First first = new First("Hello");
        first.sayHello();
    }
}
