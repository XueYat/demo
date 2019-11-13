package com.ch02.objectoriented.ch04;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/23 14:38
 */
public class Demo20Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo20Dog demo20Dog = new Demo20Dog();
        Demo20Penguin demo20Penguin = new Demo20Penguin();
        Demo20Master demo20Master = new Demo20Master();
        demo20Dog.info("欧欧", 98);
        demo20Penguin.info("楠楠", 80);
        demo20Dog.show();
        demo20Penguin.show();
        String answer = "y";
        while (answer.equals("y")) {
            System.out.print("请选择你要喂食的宠物：(1.狗狗\t2.企鹅)");
            int choose = sc.nextInt();
            if (choose == 1) {
                demo20Master.feeding(demo20Dog);
            } else {
                demo20Master.feeding(demo20Penguin);
            }
            System.out.print("\n是否继续喂食？(y/n)");
            answer = sc.next();
        }
    }
}
