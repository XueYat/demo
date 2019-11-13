package com.ch03.advancedfeatures.ch04;

import java.util.Random;
import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/4/4 14:39
 */
public class SingUp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*String zh = "tom";
        String mm = "123456";
        System.out.print("请输入账号：");
        String username = sc.next();
        System.out.print("请输入密码：");
        String password = sc.next();
        System.out.println(password.length() < 6 ? "密码长度不能小于6位！" : ((username.equals(zh) && password.equals(mm)) ? "登录成功！" : "账号或密码错误！"));*/
        /*String str = "abc";
        str += "def";
        str += "gh";
        System.out.println(str.hashCode());
        str = str.concat("def");
        System.out.println(str.hashCode());
        str = str.concat("gh");
        System.out.println(str.hashCode());
        System.out.println(str);*/


        /*System.out.print("请输入文件名：");
        String str1 = sc.next();
        int i = str1.lastIndexOf(".");
        String str2 = str1.substring(i + 1, str1.length());
        System.out.println(str2);*/

        Random random = new Random();
        /*for (int i = 0; i < 10; i++) {
            int num = (int) ((random.nextDouble() * 9 + 1) * 1);
            System.out.println(num);
        }*/

        String[] m = {"2", "3", "a", "C", "5", "v", "A", "g", "4", "T", "d", "1", "7", "u", "P", "Q", "X"};
        String str = "";


        for (int k = 0; k < 100; k++) {
            for (int j = 0; j < 4; j++) {
                int i = random.nextInt(m.length);
                str += m[i];
            }
            System.out.println(str);
            str = "";
        }
    }
}
