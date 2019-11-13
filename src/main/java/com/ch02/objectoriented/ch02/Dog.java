package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/19 9:52
 */
public class Dog {
    String name;
    int age;
    String color;
    Dog(){
        this("a", 1, "a");
    }
    Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    void eat(){
        eat("狗粮");

    }

    void eat(String food){
        System.out.println(food);
    }
}
