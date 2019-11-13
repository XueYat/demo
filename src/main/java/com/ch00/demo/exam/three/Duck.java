package com.ch00.demo.exam.three;

public class Duck extends Animal{

    public Duck(String name, String type, String eat, String dothing) {
        super(name, type, eat, dothing);
    }

    @Override
    public void info() {
        System.out.println("我叫" + getName() + "，是一只" + getType());
        System.out.println("我喜欢吃" + getEat());
        System.out.println("我会" + getDothing());
    }
}
