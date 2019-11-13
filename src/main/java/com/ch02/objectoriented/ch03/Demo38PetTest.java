package com.ch02.objectoriented.ch03;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/20 21:03
 */
public class Demo38PetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo8 demo8 = new Demo8();
        System.out.println("欢迎来到宠物店！");
        System.out.print("请输入要领养的宠物的名字：");
        String name = sc.next();
        System.out.print("请输入要领养的宠物的类型：(1.狗狗 2.企鹅)");
        int type = sc.nextInt();
        if (type == 1){
            System.out.print("请选择狗狗的性别：(1.狗哥 2.狗妹)");
        }else {
            System.out.print("请选择企鹅的性别：(1.Q仔 2.Q妹)");
        }
        int sex = sc.nextInt();
        System.out.print("请输入宠物健康值：");
        int health = sc.nextInt();
        if (type == 1){
            Demo38Dog dog = new Demo38Dog(name, type,sex, health, 0);
        }else {
            Demo38Penguin penguin = new Demo38Penguin(name, type, sex, health, 0);
        }
    }
}
