package com.ch00.demo.exam.three;

public class Chick extends Animal{

    public Chick(String name, String type, String eat, String dothing) {
        super(name, type, eat, dothing);
    }

    @Override
    public void info() {
        System.out.println("我叫" + getName() + "，是一只" + getType());
        System.out.println("我喜欢吃" + getEat());
        System.out.println("我会" + getDothing());
    }
}
