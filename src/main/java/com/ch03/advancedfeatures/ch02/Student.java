package com.ch03.advancedfeatures.ch02;


import java.util.*;

/**
 * @author YatXue
 * @date 2019/4/2 14:45
 */
public class Student {
    private int stuId;
    private String stuName;
    private String stuSex;

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public String getStuSex() {
        return stuSex;
    }

    public void setStuSex(String stuSex) {
        this.stuSex = stuSex;
    }

    public static void main(String[] args) {
        Map<Integer, Student> s = new HashMap<Integer, Student>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setStuId(1);
        s2.setStuId(2);
        s3.setStuId(3);

        s1.setStuName("一一");
        s2.setStuName("二二");
        s3.setStuName("三三");

        s1.setStuSex("男");
        s2.setStuSex("女");
        s3.setStuSex("男");

        s.put(s1.getStuId(), s1);
        s.put(s2.getStuId(), s2);
        s.put(s3.getStuId(), s3);

        System.out.println(s.keySet());
        System.out.println(s.values());

        Student student = (Student) s.get(1);
        System.out.println(student.getStuId() + "-" + student.getStuName() + "-" + student.getStuSex());

        System.out.println("增强型for>>>>>键");
        for (Object o : s.keySet()) {
            Student student1 = (Student) s.get(o);
            System.out.println(student1.getStuId() + "***" + student1.getStuName() + "***" + student1.getStuSex());
        }

        System.out.println("增强型for>>>>>值");
        for (Object value : s.values()) {
            Student student1 = (Student) value;
            System.out.println(getKey(s, student1));
            System.out.println(student1.getStuId() + "***" + student1.getStuName() + "***" + student1.getStuSex());
        }

        System.out.println("Iterator迭代器");
        Iterator iterator = s.keySet().iterator();
        while (iterator.hasNext()) {
            /*int a = (int) iterator.next();*/
            Student student1 = (Student) s.get(iterator.next());
            System.out.println(student1.getStuId() + "***" + student1.getStuName() + "***" + student1.getStuSex());
        }

        System.out.println(getKey(s, s1));
    }



    //根据value值获取到对应的一个key值
    public static int getKey(Map map, Student value){
        int key = 0;
        //Map,HashMap并没有实现Iteratable接口.不能用于增强for循环.
        for (Object o : map.keySet()) {
            if(map.get(o).equals(value)){
                key = (int) o;
            }
        }
        return key;
        //这个key肯定是最后一个满足该条件的key.
    }

}