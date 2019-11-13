package com.ch00.demo.day0724;

public class Fish extends Animal{
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    void info(int age) {
        System.out.println("我是一只" + getWeight() + "斤重的鱼，今年" + age + "岁了");
    }
}
