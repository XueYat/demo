package com.ch00.demo.test;
import com.ch00.demo.pet.*;

import java.util.Scanner;

public class Pet {
    public static void main(String[] args){
        Dog dog = null;
        Penguin penguin = null;
        Scanner sc = new Scanner(System.in);
        String name, varieties = null, sex = null;
        int num;
        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养的宠物名字：");
        name = sc.next();
        System.out.print("请输入要领养的宠物类型：(1.狗狗 2.企鹅)");
        num = sc.nextInt();
        if(num == 1){
            System.out.print("请选择狗狗的品种：(1.聪明的拉布拉多 2.酷酷的雪纳瑞)");
            num = sc.nextInt();
            if(num == 1){
                varieties = "聪明的拉布拉多";
            }else if(num == 2){
                varieties = "酷酷的雪纳瑞";
            }
            System.out.print("请输入狗狗的健康值：");
            int helth = sc.nextInt();
            dog = new Dog(name , varieties);
            dog.setHelth(helth);
            dog.intro();
        }else if(num == 2){
            System.out.print("请选择企鹅的性别：(1.Q仔 2.Q妹)");
            num = sc.nextInt();
            if(num == 1){
                sex = penguin.getSexMale();
            }else if(num == 2){
                sex = penguin.getSexFemale();
            }
            System.out.print("请输入企鹅的健康值：");
            int helth = sc.nextInt();
            penguin = new Penguin(name);
            penguin.setSex(sex);
            penguin.setHelth(helth);
            penguin.intro();
        }

    }
}
