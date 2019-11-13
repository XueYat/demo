package com.ch00.demo.MyShopping;

import com.ch00.demo.MyShopping.Admin.Admin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Admin admin = new Admin();
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("\t\t\t\t\t\t欢迎使用我行我素购物管理系统\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t\t\t\t 1. 登 录 系 统\n");
        System.out.println("\t\t\t\t\t\t\t 2. 退 出\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择，输入数字：");
        number = scanner.nextInt();
        if (number == 1){
            admin.AdminLogin();
        }else {
            System.out.println("系统退出！");
        }
    }
}
