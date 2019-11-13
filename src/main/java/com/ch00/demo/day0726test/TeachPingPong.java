package com.ch00.demo.day0726test;

import com.ch00.demo.day0726test.impl.StudyEnglish;

public class TeachPingPong  extends Teach implements StudyEnglish {

    public TeachPingPong(String name){
        this.setName(name);
    }

    @Override
    public void studyEnglish() {
        System.out.print("需要学习英文！");
    }

    @Override
    public void print() {
        System.out.print("乒乓球教练" + getName());
        studyEnglish();
        System.out.println();
    }
}
