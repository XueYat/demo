package com.ch02.objectoriented.ch01.demo30;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/13 20:46
 */
public class Demo30Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Demo30Administrator admin0 = new Demo30Administrator();
        Demo30Administrator admin1 = new Demo30Administrator();
        Demo30Customer customer = new Demo30Customer();
        /*admin0.userName1 = "admin0";
        admin0.passWord1 = "admin0";
        admin1.userName1 = "admin1";
        admin1.passWord1 = "admin1";
        admin0.show();
        admin1.show();*/

        System.out.print("请输入账号：");
        admin0.userName1 = sc.next();
        System.out.print("请输入密码：");
        admin0.passWord1 = sc.next();
        admin0.show();

        /*System.out.print("请输入卡型：");
        customer.type = sc.next();
        System.out.print("请输入积分：");
        customer.integral = sc.nextInt();
        customer.show();*/
    }
}
