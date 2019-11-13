package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/19 9:52
 */
public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("哈士奇", 3,   "黑白");
        System.out.println(dog.name + "，今年" + dog.age + "岁，是" + dog.color + "色");
    }
}
