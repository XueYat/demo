package com.ch02.objectoriented.ch02;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/18 11:52
 */
public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[3];
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.print("请输入姓名：");
            students[i].name = sc.next();
            System.out.print("请输入年龄：");
            students[i].age = sc.nextInt();
            System.out.print("请输入成绩：");
            students[i].score = sc.nextDouble();
        }


        System.out.println("姓名\t\t年龄\t\t成绩");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "\t\t" + students[i].age + "\t\t" + students[i].score);
        }

        Teacher teacher = new Teacher();
        teacher.upScore(students);
        System.out.println("加分后为：");
        System.out.println("姓名\t\t年龄\t\t成绩");
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + "\t\t" + students[i].age + "\t\t" + students[i].score);
        }
    }
}
