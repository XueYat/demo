package com.ch00.demo.demo1.Demo;

import java.util.Scanner;

public class MyShopping {
    static int num = 0;
    static Scanner sc = new Scanner(System.in);

    public void menu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1.登录系统");
        System.out.println("\t\t2.退出系统");
    }

    public void firstmenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1.客户信息管理");
        System.out.println("\t\t2.真情回馈");
        System.out.println("\t\t3.返回");
    }

    public void secondmenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1.添加客户信息");
        System.out.println("\t\t2.返回");
    }

    public void thirddmenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1.幸运大放送");
        System.out.println("\t\t2.返回");
    }


    public static void main(String[] args){
        for(;;){
            MyShopping ms = new MyShopping();
            ms.menu();
            System.out.print("请选择：");
            num = sc.nextInt();
            if(num == 1) {
                for (; ; ) {
                    ms.firstmenu();
                    System.out.print("请选择：");
                    num = sc.nextInt();
                    if (num == 1) {
                        for(;;) {
                            ms.secondmenu();
                            System.out.print("请选择：");
                            num = sc.nextInt();
                            if (num == 1) {
                                System.out.println("执行添加客户信息操作！");
                            } else if (num == 2) {
                                break;
                            } else {
                                break;
                            }
                        }
                    } else if (num == 2) {
                        for(;;) {
                            ms.thirddmenu();
                            System.out.print("请选择：");
                            num = sc.nextInt();
                            if (num == 1) {
                                System.out.println("执行添加幸运大放送操作！");
                            } else if (num == 2) {
                                break;
                            } else {
                                break;
                            }
                        }
                    }else if(num == 3){
                        break;
                    }else{
                        break;
                    }
                }
            }else if (num == 2) {
                System.out.println("退出系统");
                break;
            } else {
                System.out.println("退出系统");
                break;
            }
        }

    }
}
