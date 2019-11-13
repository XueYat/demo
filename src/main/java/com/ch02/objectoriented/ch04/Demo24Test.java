package com.ch02.objectoriented.ch04;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/23 15:57
 */
public class Demo24Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo24Dog demo24Dog = new Demo24Dog("欧欧");
        Demo24Penguin demo24Penguin = new Demo24Penguin("楠楠");
        Demo24Master demo24Master = new Demo24Master();
        Demo24Pet demo24Pet = new Demo24Pet();
        demo24Dog.info();
        demo24Penguin.info();
        System.out.print("请选择您要领养的宠物：(1.狗狗\t2.企鹅)");
        int strain = sc.nextInt();
        if (strain == 1){
            demo24Pet = demo24Dog;
            demo24Master.adoption(demo24Dog);
        }else {
            demo24Pet = demo24Penguin;
            demo24Master.adoption(demo24Penguin);
        }
        System.out.print("是否与宠物互动？(y/n)");
        String answer = sc.next();
        while (answer.equals("y")) {
            demo24Master.play(demo24Pet);
            System.out.print("是否继续？(y/n)");
            answer = sc.next();
        }
        System.out.println("系统退出！");
    }
}
