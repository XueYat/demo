package com.ch00.demo.day0726test;

public class PetTest {
    public static void main(String[] args) {
        Dog dog = new Dog("WW", 100, 100);
        Penguin penguin = new Penguin("QQ", 100, 100);
        dog.print();
        System.out.println();
        penguin.print();
    }
}
