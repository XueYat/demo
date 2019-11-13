package com.ch02.objectoriented.ch01;

/**
 * @author YatXue
 * @date 2019/3/13 18:40
 */
public class Demo24 {
    static class Student{
        String stuName = "张三";
        int stuAge = 21;
        String stuClass = "C30";
        String stuFav = "编程";
        void display(){
            System.out.println(stuName + "\n年龄：" + stuAge + "\n班级：" + stuClass + "\n爱好：" + stuFav);
        }
    }

    static class Teacher{
        String teaName = "李四";
        String major = "计算机";
        String teach = "使用Java语言理解程序逻辑";
        int teachAge = 5;
        void display(){
            System.out.println(teaName + "\n专业方向：" + major + "\n教授课程：" + teach + "\n教龄：" + teachAge);
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher = new Teacher();
        student.display();
        teacher.display();
    }
}
