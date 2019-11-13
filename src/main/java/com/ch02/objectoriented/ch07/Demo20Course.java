package com.ch02.objectoriented.ch07;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/28 12:12
 */
public class Demo20Course {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入课程代号：(1~3之间的数字)");
        int num = 0;
        try{
            num = sc.nextInt();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("欢迎提出建议！");
        }
        switch (num){
            case 1:
                System.out.println("C#编程");
                break;
            case 2:
                System.out.println("Java");
                break;
            case 3:
                System.out.println("ASP .NET");
                break;
            default:
                System.out.println("请按提示输入！");
        }
    }
}
