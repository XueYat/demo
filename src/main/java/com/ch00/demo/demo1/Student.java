package com.ch00.demo.demo1.Demo;

import java.util.Scanner;

public class Student {

    static Scanner sc = new Scanner(System.in);
    public Student[] students = new Student[5];
    public String name;
    public int age;
    public String sex;

    public void addStudent(Student s){
        for(int i = 0; i < students.length; i++){
            if(students[i] == null){
                students[i] = s;
                System.out.println("添加成功！");
                break;
            }else{
                System.out.println("添加失败！");
            }
        }
    }

    public void displayStudent(){
        System.out.println("姓名\t\t" + "年龄\t\t" + "性别");
        for(int i = 0; i < students.length; i++){
            if(students[i] != null){
                System.out.print(students[i].name + "\t\t" + students[i].age + "\t\t" + students[i].sex);
            }
        }
    }

    public static void main(String[] args){
        Student s = new Student();
        System.out.print("请输入学生姓名：");
        s.name = sc.next();
        System.out.print("请输入学生年龄：");
        s.age = sc.nextInt();
        System.out.print("请输入学生性别：");
        s.sex = sc.next();
        s.addStudent(s);
        s.displayStudent();
    }
}
