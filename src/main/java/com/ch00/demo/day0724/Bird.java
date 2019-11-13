package com.ch00.demo.day0724;

public class Bird extends Animal{

    private String color;












    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    void info(int age) {
        System.out.println("我是一只" + getColor() + "的鸟，今年" + age + "岁了");
    }


}
