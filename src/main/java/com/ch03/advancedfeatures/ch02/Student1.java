package com.ch03.advancedfeatures.ch02;

import java.util.Comparator;

/**
 * @author YatXue
 * @date 2019/4/2 17:25
 */
public class Student1 implements Comparable {
    int id;
    String name;
    int age;

    Student1(){}

    Student1(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
        this.age = age;
    }

    @Override
    public int compareTo(Object obj){
        Student1 student=(Student1)obj;
        if(this.id == student.id){
            return 0;
        }else if(this.id > student.id){
            return 1;
        }else{
            return -1;
        }
    }
}
