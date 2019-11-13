package com.ch02.objectoriented.ch02;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 19:08
 */
public class Demo14 {
    static Scanner sc = new Scanner(System.in);
    int java, c, asp;
    void sum(){
        System.out.println("总成绩是：" + (java + c + asp));
    }
    void avg(){
        System.out.println("平均分是：" + (java + c + asp) / 3);
    }

    public static void main(String[] args) {
        Demo14 demo14 = new Demo14();
        System.out.print("请输入java成绩：");
        demo14.java = sc.nextInt();
        System.out.print("请输入c成绩：");
        demo14.c = sc.nextInt();
        System.out.print("请输入asp成绩：");
        demo14.asp = sc.nextInt();
        demo14.sum();
        demo14.avg();
    }
}
