package com.ch00.demo.practice;
import com.ch00.demo.practice.impl.Terrestrial;

public class Dolphin extends Animal implements Terrestrial {
    private int legNum;

    public Dolphin(String name, int legNum){
        super(name);
        this.legNum = legNum;
    }

    @Override
    public int getLegNum() {
        return legNum;
    }

    @Override
    public void shout() {
        String sound = "呜呜呜";
        System.out.println(sound);
    }
}
