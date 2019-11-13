package com.ch02.objectoriented.test;

/**
 * @author YatXue
 * @date 2019/3/13 15:56
 */
public class Pet implements Info{
    private String type;
    private String color;
    private String barking;
    private int legs;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    private String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    private String getBarking() {
        return barking;
    }

    void setBarking(String barking) {
        this.barking = barking;
    }

    private int getLegs() {
        return legs;
    }

    void setLegs(int legs) {
        this.legs = legs;
    }

    void show(){
        System.out.println("物种：" + getType() + "，叫声：" + getBarking() + "，腿数：" + getLegs() + "，颜色：" + getColor());
    }

    void eat(){
        System.out.print("我吃");
    }

    @Override
    public void name(String name) {
        System.out.print("，我的名字叫" + name);
    }
}
