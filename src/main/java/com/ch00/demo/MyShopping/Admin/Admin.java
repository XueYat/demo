package com.ch00.demo.MyShopping.Admin;

import com.ch00.demo.MyShopping.ShopMenu.ShopMenu;
import java.util.Scanner;

public class Admin {
    public void AdminLogin(){
        ShopMenu shopMenu = new ShopMenu();
        Scanner scanner = new Scanner(System.in);
        String username, password;
        for (int i = 3; i >= 1; i--){
            System.out.println("欢迎进入我行我素购物管理系统");
            System.out.print("请输入用户名：");
            username = scanner.next();
            System.out.print("请输入密  码：");
            password = scanner.next();
            if ("admin".equals(username) && "admin".equals(password)){
                shopMenu.ShopMenuDisplay();
                break;
            }else {
                if (i == 1){
                    System.out.println("您没有权限进入系统！");
                }else{
                    System.out.println("账号或密码错误，请重新尝试，您还有" + (i - 1) + "次机会！");
                }
            }
        }
    }
}
