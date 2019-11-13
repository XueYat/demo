package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 13:54
 */
public class Demo12Student {
    int id;
    String name;
    int age;

    Demo12Student(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Demo12Student)){
            return false;
        }
        Demo12Student student = (Demo12Student) obj;
        if (this.id == student.id && this.name.equals(student.name) && this.age ==student.age){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        Demo12Student student1 = new Demo12Student(1, "张三", 20);
        Demo12Student student2 = new Demo12Student(1, "张三", 20);
        System.out.println(student1.equals(student2));
    }
}
