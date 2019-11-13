package com.ch00.demo.day0726test;
import com.ch00.demo.day0726test.impl.*;

public class SporterPingPong extends Sporter implements StudyEnglish{

    public SporterPingPong(String name){
        setName(name);
    }

    @Override
    public void studyEnglish() {
        System.out.print("需要学习英文！");
    }

    @Override
    public void print() {
        System.out.print("乒乓球队员" + getName());
        studyEnglish();
        System.out.println();
    }
}
