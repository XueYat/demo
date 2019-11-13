package com.ch00.demo.demo1.Demo;

import java.util.Scanner;
public class Admin {
    static Scanner sc = new Scanner(System.in);
    static String username, password;
    public void update(){
        System.out.println("请输入新密码：");
        password = sc.next();
    }
    public static void main(String[] args){
        Admin admin = new Admin();
        System.out.println("请输入账号：");
        username = sc.next();
        System.out.println("请输入密码：");
        password = sc.next();

        while (username.equals("admin") && password.equals("admin")){
            System.out.println("登陆成功！");
            System.out.println("执行修改密码功能！");
            admin.update();
        }
    }
}
