package com.exam.student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author YatXue
 * @date 2019/4/26 15:04
 */
public class StudentTest {
    public static void main(String[] args) {
        /*实例化五个学生对象*/
        Student student1 = new Student(1, "张三", 20, "13546171001", "山西省太原市小店区");
        Student student2 = new Student(2, "李四", 20, "13546171002", "山西省太原市小店区");
        Student student3 = new Student(3, "王五", 20, "13546171003", "山西省太原市小店区");
        Student student4 = new Student(4, "赵六", 20, "13546171004", "山西省太原市小店区");
        Student student5 = new Student(5, "田七", 20, "13546171005", "山西省太原市小店区");
        /*建立Map集合*/
        Map<Integer, Student> map = new HashMap<>();
        /*将五个学生对象存放到Map集合中*/
        map.put(student1.getStuId(), student1);
        map.put(student2.getStuId(), student2);
        map.put(student3.getStuId(), student3);
        map.put(student4.getStuId(), student4);
        map.put(student5.getStuId(), student5);

        /*创建学生对象用于接收遍历出来的学生对象*/
        Student student = null;

        /*foreach遍历*/
        System.out.println("foreach");
        for (Integer integer : map.keySet()) {
            student = map.get(integer);
            System.out.println(student.getStuId() + "-" + student.getStuName() + "-" + student.getStuAge() + "-" + student.getStuPhone() + "-" + student.getStuAddress());
        }

        /*Iterator*/
        System.out.println("Iterator");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            student = map.get(iterator.next());
            System.out.println(student.getStuId() + "-" + student.getStuName() + "-" + student.getStuAge() + "-" + student.getStuPhone() + "-" + student.getStuAddress());
        }
    }
}
