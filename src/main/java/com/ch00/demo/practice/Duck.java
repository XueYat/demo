package com.ch00.demo.practice;
import com.ch00.demo.practice.impl.Terrestrial;

public class Duck extends Animal implements Terrestrial {
    private int legNum;

    public Duck(String name, int legNum) {
        super(name);
        this.legNum = legNum;
    }

    @Override
    public int getLegNum() {
        return legNum;
    }

    @Override
    public void shout() {
        String sound = "嘎嘎嘎";
        System.out.println(sound);
    }
}
