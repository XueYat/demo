package com.ch03.advancedfeatures.ch04;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/4/4 8:53
 */
public class SignUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("*****欢迎进入注册系统*****");
        do {
            System.out.print("请输入用户名：");
            String username = sc.next();
            System.out.print("请输入密码：");
            String password = sc.next();
            System.out.print("请再次输入密码：");
            String password1 = sc.next();
            if (username.length() >= 3 && password.length() >= 6 && password.equals(password1)){
                System.out.println("注册成功，请牢记用户名和密码！");
                break;
            }
            if (username.length() < 3){
                System.out.print("用户名长度不能小于3");
                flag = false;
            }
            if (password.length() < 6){
                System.out.print("密码长度不能小于6！");
                flag = false;
            }
            if (!password.equals(password1)){
                System.out.println("两次密码不相同！");
                flag = false;
            }
        }while (flag);
    }
}
