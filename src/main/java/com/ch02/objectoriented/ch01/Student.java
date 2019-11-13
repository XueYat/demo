package com.ch02.objectoriented.ch01;

/**
 * @author YatXue
 * @date 2019/3/15 9:58
 */
public class Student {
    String stuID;
    String stuName;
    int stuAge;
    String stuSex;

    public void show(){
        String stuName1;
        System.out.println("我的学号为：" + stuID + "，名字叫" + this.stuName + "，今年" + stuAge + "岁，性别是：" + stuSex);
    }
    public String eat(String eat){
        return "我喜欢吃" + eat;
    }
}
