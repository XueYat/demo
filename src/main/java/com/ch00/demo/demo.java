package com.ch00.demo;

import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer;

        /*System.out.println("成绩是否合格？(y/n)");
        answer = sc.next();
        while (answer.equals("n")){
            System.out.println("上午学习理论，下午上机练习");
            System.out.println("成绩是否合格？(y/n)");
            answer = sc.next();
        }
        System.out.println("合格！");*/

        /*do {
            System.out.println("上午学习理论，下午上机练习");
            System.out.println("成绩是否合格？(y/n)");
            answer = sc.next();
        }while (answer.equals("n"));
        System.out.println("合格");*/
        

        //定义图形的行数
        int max = 3;

        //正三角形
        for(int i = 1; i <= max; i++) {
            for(int k = 1; k <= max-i; k++) {
                System.out.print(" ");
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //正三角形
        for (int i = 1; i <= max; i++){
            for (int k = 1; k < i; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * (max - i) + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //等腰直角三角形
        for (int i = 1; i <= max; i++){
            for (int j = max; j < max + i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //等腰直角三角形
        for (int i = 1; i <= max; i++){
            for (int j = 0; j <= max - i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        //冒泡排序
        int[] list = {1, 3, 2, 5, 4};
        int temp;
        for (int i = 0; i < list.length - 1; i++){
            for (int j = 0; j < list.length - 1 - i; j++) {
                if(list[j] > list[j+1]){
                    temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < list.length; i++){
            System.out.print(list[i]);
        }

        int[] list1 = {1, 3, 2, 5, 4};
        int temp1;
        for (int i = 0; i < list1.length - 1; i++){
            for (int j = 0; j < list1.length - 1 - i; j++){
                if (list1[j] < list1[j + 1]){
                    temp1 = list1[j];
                    list1[j] = list1[j + 1];
                    list1[j + 1] = temp1;
                }
            }
        }
        for (int list2:
             list1) {
            System.out.print(list2);
        }

        /*int[] num = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入一个四位数：");
        int n = sc.nextInt();
        for (int i = 0; i < 4; i++){
            num[i] = n % 10;
            n = n / 10;
        }
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);*/

        /*// byte
        System.out.println("基本类型：byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类：java.lang.Byte");
        System.out.println("最小值：Byte.MIN_VALUE=" + Byte.MIN_VALUE);
        System.out.println("最大值：Byte.MAX_VALUE=" + Byte.MAX_VALUE);
        System.out.println();

        // short
        System.out.println("基本类型：short 二进制位数：" + Short.SIZE);
        System.out.println("包装类：java.lang.Short");
        System.out.println("最小值：Short.MIN_VALUE=" + Short.MIN_VALUE);
        System.out.println("最大值：Short.MAX_VALUE=" + Short.MAX_VALUE);
        System.out.println();

        // int
        System.out.println("基本类型：int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类：java.lang.Integer");
        System.out.println("最小值：Integer.MIN_VALUE=" + Integer.MIN_VALUE);
        System.out.println("最大值：Integer.MAX_VALUE=" + Integer.MAX_VALUE);
        System.out.println();

        // long
        System.out.println("基本类型：long 二进制位数：" + Long.SIZE);
        System.out.println("包装类：java.lang.Long");
        System.out.println("最小值：Long.MIN_VALUE=" + Long.MIN_VALUE);
        System.out.println("最大值：Long.MAX_VALUE=" + Long.MAX_VALUE);
        System.out.println();

        // float
        System.out.println("基本类型：float 二进制位数：" + Float.SIZE);
        System.out.println("包装类：java.lang.Float");
        System.out.println("最小值：Float.MIN_VALUE=" + Float.MIN_VALUE);
        System.out.println("最大值：Float.MAX_VALUE=" + Float.MAX_VALUE);
        System.out.println();

        // double
        System.out.println("基本类型：double 二进制位数：" + Double.SIZE);
        System.out.println("包装类：java.lang.Double");
        System.out.println("最小值：Double.MIN_VALUE=" + Double.MIN_VALUE);
        System.out.println("最大值：Double.MAX_VALUE=" + Double.MAX_VALUE);
        System.out.println();

        // char
        System.out.println("基本类型：char 二进制位数：" + Character.SIZE);
        System.out.println("包装类：java.lang.Character");
        // 以数值形式而不是字符形式将Character.MIN_VALUE输出到控制台
        System.out.println("最小值：Character.MIN_VALUE="
                + (int) Character.MIN_VALUE);
        // 以数值形式而不是字符形式将Character.MAX_VALUE输出到控制台
        System.out.println("最大值：Character.MAX_VALUE="
                + (int) Character.MAX_VALUE);*/
    }
}
