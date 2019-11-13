package com.ch03.advancedfeatures.ch02;

import java.util.*;

/**
 * @author YatXue
 * @date 2019/4/2 17:24
 */
public class StudentTest {
    public static void main(String[] args) {
        Student1 student1 = new Student1(1, "一", 20);
        Student1 student2 = new Student1(2, "二", 20);
        Student1 student3 = new Student1(3, "三", 20);
        Student1 student4 = new Student1(4, "四", 20);
        Student1 student5 = new Student1(5, "五", 20);
        List<Student1> list = new ArrayList<Student1>();
        list.add(student1);
        list.add(student3);
        list.add(student4);
        list.add(student2);
        list.add(student5);

        System.out.println("排序前");
        Iterator<Student1> iterator = list.iterator();
        while(iterator.hasNext()){
            Student1 stu = iterator.next();
            System.out.println(stu.id);
        }

        System.out.println("排序后");
        Collections.sort(list);
        iterator = list.iterator();
        while(iterator.hasNext()){
            Student1 stu = iterator.next();
            System.out.println(stu.id);
        }
    }
}
