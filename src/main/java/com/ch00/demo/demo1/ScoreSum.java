package com.ch00.demo.demo1.Demo;

import java.util.Scanner;

public class ScoreSum {
    private double java = 0, sql = 0, Android = 0, sum = 0, avg = 0;

    public double sum(){
        return sum = java + sql + Android;
    }
    public double avg(){
        sum();
        return avg = sum / 3;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ScoreSum ss = new ScoreSum();

        System.out.print("请输入java成绩：");
        ss.java = sc.nextDouble();
        System.out.print("请输入sql成绩：");
        ss.sql = sc.nextDouble();
        System.out.print("请输入Android成绩：");
        ss.Android = sc.nextDouble();

        ss.avg();
        System.out.println("总分是：" + ss.sum);
        System.out.println("平均分是：" + ss.avg);

    }

}
