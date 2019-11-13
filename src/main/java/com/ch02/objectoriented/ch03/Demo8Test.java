package com.ch02.objectoriented.ch03;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/19 20:00
 */
public class Demo8Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo8 demo8 = new Demo8();
        System.out.println("欢迎来到宠物店！");
        System.out.print("请输入要领养的宠物的名字：");
        demo8.setName(sc.next());
        System.out.print("请输入要领养的宠物的类型：(1.狗狗 2.企鹅)");
        demo8.setType(sc.next());
        if (demo8.getType().equals("狗狗")){
            System.out.print("请选择" + demo8.getType() + "的性别：(1.狗哥 2.狗妹)");
            demo8.setSex(sc.next());
        }else {
            System.out.print("请选择" + demo8.getType() + "的性别：(1.Q仔 2.Q妹)");
            demo8.setSex(sc.next());
        }
        System.out.print("请输入宠物健康值：");
        demo8.setHealth(sc.nextInt());
        demo8.info();

    }
}
