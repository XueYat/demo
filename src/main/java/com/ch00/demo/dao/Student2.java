package com.ch00.demo.demo1.dao;

public class Student2 {
    private String name;
    private int age;
    private String sex;
    private String major;

    public Student2(String sex, String major){
        this.sex = sex;
        this.major = major;
    }

    public Student2(String name, int age, String sex, String major){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.major = major;
    }

    public void intro(){
        System.out.println("我叫" + name + "，今年" + age + "岁，是一个" + sex + "生，主修" + major + "专业。");
    }
}
