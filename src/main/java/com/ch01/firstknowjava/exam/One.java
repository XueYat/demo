package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/22 15:11
 */
public class One {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入学生的考试成绩：");
        int score = sc.nextInt();
        if (score == 100){
            System.out.println("优秀！");
        }else if (score >= 80){
            System.out.println("良好！");
        }else if (score >= 60){
            System.out.println("中等！");
        }else if (score < 60){
            System.out.println("差！");
        }
    }
}
