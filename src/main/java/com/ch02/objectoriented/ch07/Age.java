package com.ch02.objectoriented.ch07;

/**
 * @author YatXue
 * @date 2019/3/28 13:30
 */
public class Age {
    int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 1 || age >= 100){
            throw new Exception("年龄必须在1-100之间！");
        }else {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Age age = new Age();
        try {
            age.setAge(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
