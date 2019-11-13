package com.ch00.demo.demo1.Demo;/*import java.util.Scanner;
public class com.day.Demo11.Demo11.Score {
    public static void main(String[] args) {
        int lisi_score = 80;
        Scanner Input = new Scanner(System.in);
        System.out.print("请输入张三的成绩：");
        int zhangsan_score = Input.nextInt();
        System.out.println("张三的成绩比李四的成绩高吗？");
        if(zhangsan_score > lisi_score){
            System.out.println("是");
        }else {
            System.out.println("否");
        }
    }
}*/

import java.util.Scanner;
public class Score{
    static int[] a=new int[4];
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        try{
            System.out.print("输入一个整数");
            int x=in.nextInt();
            getValue(x);//求出个位数~千位数的方法
            in.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void getValue(int x){
        int x1 = x;
        for(int k = 0 ; k < 4 ; k++){
            a[k] = x1 % 10;
            x1 = x1 / 10;
        }
        System.out.println(x+"的个位数:"+a[0]);
        System.out.println(x+"的十位数:"+a[1]);
        System.out.println(x+"的百位数:"+a[2]);
        System.out.println(x+"的千位数:"+a[3]);
    }
}
