package com.ch02.objectoriented.ch01;

/**
 * @author YatXue
 * @date 2019/3/15 10:29
 */
public class StudnetTest {
    public static void main(String[] args) {
        Student student = new Student();
        student.stuID = "1600";
        student.stuName = "张三";
        student.stuAge = 20;
        student.stuSex = "男";
        student.show();
        System.out.println(student.eat("剔尖"));

        Student student1 = new Student();
        student1.stuName = "李四";
        student1.stuSex = "女";
        student1.stuAge = 18;
        student1.stuID = "1601";
        student1.show();
        System.out.println(student1.eat("剔尖"));
    }
}
