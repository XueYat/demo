package com.ch02.objectoriented.ch03;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/22 11:01
 */
public class UpPetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入宠物的姓名：");
        String name = sc.next();
        System.out.print("请输入宠物的类别：(1.狗狗 2.企鹅)");
        int type = sc.nextInt();
        if (type == 1){
            System.out.print("请选择狗狗的性别：(1.狗哥 2.狗妹)");
            int sex = sc.nextInt();
            System.out.print("请输入狗狗的健康值：");
            int health = sc.nextInt();
            UpDog upDog = new UpDog(name, sex, health, 0);
            upDog.show();
        }else {
            System.out.print("请选择企鹅的性别：(1.Q仔 2.Q妹)");
            int sex = sc.nextInt();
            System.out.print("请输入企鹅的健康值：");
            int health = sc.nextInt();
            UpPenguin upPenguin = new UpPenguin(name, sex, health, 0);
            upPenguin.show();
        }
    }
}
