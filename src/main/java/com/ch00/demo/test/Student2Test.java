package com.ch00.demo.test;
import com.ch00.demo.demo1.dao.Student2;

public class Student2Test {
    public static void main(String[] args){
        Student2 stu;
        stu = new Student2("男" , "java");
        stu.intro();
        stu = new Student2("张三" , 20 , "女" , "python");
        stu.intro();
    }
}
