package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/25 10:05
 */
public class Demo12Person {
    private int id;
    private String name;
    private int age;

    private Demo12Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Demo12Person)){
            return false;
        }
        Demo12Person person = (Demo12Person) obj;
        return this.id == person.id;
    }

    public static void main(String[] args) {
        Demo12Person person1 = new Demo12Person(1, "张三", 20);
        Demo12Person person2 = new Demo12Person(1, "张三", 20);
        Demo12Person person3 = person1;
        System.out.println(person1.equals(person2));
        System.out.println(person1.equals(person3));
    }
}
