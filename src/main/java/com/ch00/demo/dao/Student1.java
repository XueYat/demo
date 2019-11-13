package com.ch00.demo.dao;

public class Student1 {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 16){
            System.out.println("年龄太小！");
        }else{
            this.age = age;
        }
    }

    public void intro(){
        System.out.println("我叫" + name + "，今年" + age + "岁。");
    }
}
