package com.ch00.demo.practice;
import com.ch00.demo.practice.impl.Terrestrial;

public class Cat extends Animal implements Terrestrial {
    private int legNum;

    public Cat(String name, int legNum){
        super(name);
        this.legNum = legNum;
    }

    @Override
    public int getLegNum() {
        return legNum;
    }

    @Override
    public void shout() {
        String sound = "喵喵瞄";
        System.out.println(sound);
    }
}
