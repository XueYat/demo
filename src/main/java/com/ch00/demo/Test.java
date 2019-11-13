package com.ch00.demo;

import java.util.*;
public class Test {
    static byte a0;
    static String a1;
    static boolean a2;
    static long a3;
    static double a4;
    static char a5;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkExit(int status) {
                throw new ThreadDeath();
            }
        });
        try {
            System.exit(0);
        } finally {
            System.out.println("In the finally block");
        }*/

        /*Vector v = new Vector(10);

        for (int i = 0; i < 100; i++) {
            Object o = new Object();
            v.add(o);
            o = null;
        }*/


        /*try {
            System.exit(0);
            System.out.println("hello");
        } finally {
            System.out.println("In the finally block");
        }*/

        /*int[] a = {10, 20, 30, 40, 50};
        int[] b = new int[5];
        System.arraycopy(a, 0, b, 0, 5);
        for (int num:
             b) {
            System.out.println(num);
        }

        int num = 2 << 2;
        System.out.println(num);*/

        /*System.out.print("请问班级有几位学生：");
        //bigSamll用来接收学生位数
        int bigSamll = Input.nextInt();
        //numbs根据bigSamll来确定数组大小，用来存放每位学生的成绩
        int[] numbs = new int[bigSamll];
        //for循环来给numbs数组进行写入数据
        for (int i = 0; i < numbs.length; i++) {
            System.out.print("请输入第" + (i + 1) + "位同学的成绩。");
            numbs[i] = Input.nextInt();
        }

        //定义变量min来接收最小值，初始时不知道最小值是多少，直接给它赋值等于在数组中下标为0的数
        int min = numbs[0];
        //for循环用来遍历数组
        for (int i = 0; i < numbs.length; i++) {
            //if语句用来比较每次从数组中得到的数是否小于变量min，是则进行替换，用替换后的数再进行比较；否则进入下次循环，再次比较
            if (numbs[i] < min) {
                min = numbs[i];
            }
        }
        System.out.println("最小成绩为：" + min);*/


        /*for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }*/


        /*int x;
        for (int i = 3; i <= 100; i += 2) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    flag = false;
                    break;
                }
                *//*if (i % j == 0){
                    x = i / j;
                    System.out.println(i + "=" + j  + "*" + x);

                }*//*
            }
            if (flag){
                System.out.println(i);
            }
        }*/


        /*boolean bool;
        for (int i = 3; i < 100; i += 2) {
            bool = true;
            for (int j = 3; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    bool = false;
                    break;
                }
            }
            if (bool) {
                System.out.print(i + "\t");
            }
        }*/


        //System.out.println(5/2);

        /*System.out.println(a0);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);

        System.out.println((32 + 10) / (7 * 3) % 3);
        System.out.println(4 % 5);

        float num = 89L;
        System.out.println(num);

        boolean flag1 = true;
        boolean flag2 = true;

        int x = 1;
        x += x + 3;
        System.out.println(x);*/

        //System.out.println(isPrime(4567));


        /*String str1 = "abc";
        String str2 = "abc";

        String str3 = new String("abc");
        String str4 = new String("abc");
        System.out.println(str1 == str2);   //true
        System.out.println(str1 == str3);   //false
        System.out.println(str3 == str4);   //false
        System.out.println(str1.equals(str2));  //true
        System.out.println(str1.equals(str3));  //true
        System.out.println(str3.equals(str4));  //true*/


        String str1 = "Hello";
//        String str2 = "He" + "llo";
//        String str3 = "Hello";
//
//        System.out.println(str1);
//        System.out.println(str2);
//
//        System.out.println(str1 == str2);
//        System.out.println(str1 == str3);
//
//
//
//         char a= 36;
//        System.out.println(a);
//    }
//
//
//    public static boolean isPrime(int num) {
//        if (num <= 3) {
//            return num > 1;
//        }
//        // 不在6的倍数两侧的一定不是质数
//        if (num % 6 != 1 && num % 6 != 5) {
//            return false;
//        }
//        int sqrt = (int) Math.sqrt(num);
//        for (int i = 5; i <= sqrt; i += 6) {
//            if (num % i == 0 || num % (i + 2) == 0) {
//                return false;
//            }
//        }
//        return true;


        /*int i = 0;
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                continue;
            }
            i = i + 1;
            if (i == 5){
                break;
            }
        }
        System.out.println(i);*/

        System.out.println(1);


    }
}
