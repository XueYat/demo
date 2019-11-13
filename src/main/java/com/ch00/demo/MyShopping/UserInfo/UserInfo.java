package com.ch00.demo.MyShopping.UserInfo;

import com.ch00.demo.MyShopping.ShopMenu.ShopMenu;
import java.util.Scanner;

public class UserInfo {
    private static ShopMenu shopMenu = new ShopMenu();
    private Scanner scanner = new Scanner(System.in);
    private int[] custNo = new int[10];				//会员号
    private String[] custBirth = new String[10];	//会员生日
    private int[] custScore = new int[10];			//会员积分
    private String[] custName = new String[10];     //会员姓名
    public void UserInfoDisplay(){
        int number;
        custNo[0] = 1001;
        custName[0] = "黄一";
        custBirth[0] = "1998.02.22";
        custScore[0] = 1000;
        System.out.println("我行我素购物管理系统 > 客户信息管理\n");
        for (;;){
            System.out.println(" * * * * * * * * * * * * * * * * * * * * \n");
            System.out.println("\t\t 1. 显 示 所 有 客 户 信 息\n");
            System.out.println("\t\t 2. 添 加 客 户 信 息\n");
            System.out.println("\t\t 3. 返 回\n");
            System.out.println(" * * * * * * * * * * * * * * * * * * * * \n");
            System.out.print("请选择,输入数字:");
            number = scanner.nextInt();
            if (number == 1){
                System.out.println("显示所有客户信息\n");
                System.out.println("会员号\t|\t会员姓名\t|\t会员生日\t\t|\t会员积分");
                for (int i = 0; i < custNo.length; i++){
                    if (custNo[i] != 0){
                        System.out.println(custNo[i] + "\t|\t" + custName[i] + "\t\t|\t" + custBirth[i] + "\t|\t" + custScore[i]);
                    }
                }
            }else if (number == 2){
                System.out.println("\n添加客户信息\n");
                for (int i = 0; i < custNo.length; i++){
                    if (custNo[i] == 0){
                        custNo[i] = 1000 + i + 1;
                        System.out.print("请输入会员姓名：");
                        custName[i] = scanner.next();
                        System.out.print("请输入会员生日：");
                        custBirth[i] = scanner.next();
                        custScore[i] = 1000;
                        System.out.println("添加成功！");
                        break;
                    }
                    if (i >= 9){
                        System.out.println("客户信息队列已满！");
                    }
                }
            }else {
                shopMenu.ShopMenuDisplay();
                break;
            }
        }
    }
}
