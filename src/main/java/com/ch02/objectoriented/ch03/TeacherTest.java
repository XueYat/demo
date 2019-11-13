package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/21 11:01
 */
public class TeacherTest {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();
        Teacher.name = "张三";
        teacher1.id = 1;

        Teacher.name = "李四";
        teacher2.id = 2;

        teacher1.info();
        teacher2.info();
    }
}