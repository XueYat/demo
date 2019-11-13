package com.ch02.objectoriented.ch01.demo30;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/13 20:36
 */
public class Demo30Administrator {
    Scanner sc = new Scanner(System.in);
    private static String userName = "admin";
    private static String passWord = "admin";
    String userName1;
    String passWord1;
    void show(){
        System.out.println("账号：" + userName1 + "\t密码：" + passWord1);
        if (userName.equals(userName1) && passWord.equals(passWord1)){
            System.out.print("请输入新密码：");
            passWord1 = sc.next();
            passWord = passWord1;
            System.out.println("修改密码成功，您的新密码为：" + passWord);
        }else {
            System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
        }
    }
}
