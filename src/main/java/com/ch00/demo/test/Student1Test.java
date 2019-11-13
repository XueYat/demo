package com.ch00.demo.test;
import com.ch00.demo.dao.Student1;
import java.util.Scanner;

public class Student1Test {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student1 stu = new Student1();
        System.out.print("请输入姓名：");
        String name = sc.next();
        System.out.print("请输入年龄：");
        int age = sc.nextInt();
        stu.setName(name);
        stu.setAge(age);
        stu.intro();
    }
}
