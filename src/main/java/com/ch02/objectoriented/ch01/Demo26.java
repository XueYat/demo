package com.ch02.objectoriented.ch01;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/13 20:11
 */
public class Demo26 {
    private static Scanner sc = new Scanner(System.in);
    private static String name;
    private static int age;
    private static String temp = "n";

    private static void show(){
        while (true){
            System.out.print("请输入姓名：");
            name = sc.next();
            if (temp.equals(name)){
                break;
            }
            System.out.print("请输入年龄：");
            age = sc.nextInt();
            if (age >= 18 && age <= 60) {
                System.out.println(name + "的年龄为：" + age + "，门票价格为：20￥");
            } else {
                System.out.println(name + "的年龄为：" + age + "，门票免费");
            }
        }
        System.out.println("程序结束!");
    }

    public static void main(String[] args) {
        show();
    }
}
