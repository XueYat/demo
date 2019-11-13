package com.ch00.demo.marksix;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/22 16:48
 */
public class NumManage {
    Scanner sc = new Scanner(System.in);
    int userNum;
    int winNum;
    NumManage(){
        this.userNum = -1;
        this.winNum = 98;
    }

    void showMain(){
        System.out.println("----------------------------------------------");
        System.out.println("\t\t\t欢迎进入六合彩开奖系统");
        System.out.println("请选择您的操作：1.开始选号\t2.现在开奖\t3.退出");
        System.out.println("----------------------------------------------");
        System.out.print("请输入您的选择：");
        int num = sc.nextInt();
        switch (num){
            case 1:
                choose();
                break;
            case 2:
                lottery();
                break;
            case 3:
                System.out.println("系统退出！");
                break;
            default:
                System.out.println("请重新输入！");
        }
    }

    void choose(){
        boolean flag = true;
        System.out.print("请输入您的号码，号码最多不能超过两位数：");
        while (flag){
            int number = sc.nextInt();
            if (number >= 0 && number <= 99) {
                this.userNum = number;
                flag = false;
                showMain();
            } else {
                System.out.print("您输入的号码有误，请重新输入：");
            }
        }
    }


    void lottery(){
        if (userNum == -1) {
            System.out.println("您还没有输入您的号码！");
            choose();
        } else {
            if (userNum == winNum){
                System.out.println("恭喜您，中奖了，奖金为：" + (int)(Math.random() * 10000));
            }else {
                System.out.println("很遗憾，您没有中将，是否继续？(y/n)");
                String answer = sc.next();
                if (answer.equals("y")){
                    this.userNum = -1;
                    showMain();
                }else {
                    System.out.println("系统退出！");
                    System.exit(1);
                }
            }
        }
    }



}
