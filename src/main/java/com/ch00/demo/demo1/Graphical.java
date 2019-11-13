package com.ch00.demo.demo1.Demo;

import java.util.Scanner;

public class Graphical {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int line , num;
        System.out.println("请选择您要打印的图形：1.正直角三角形、2.倒直角三角形、3.倒直角三角形、4.正等腰三角形、5.倒等腰三角形、6.圆形");
        num = sc.nextInt();
        switch (num){
            case 1:
                System.out.print("请输入要打印的直角三角形的行数：");
                line =sc.nextInt();
                for(int i = 0; i <= line; i++){
                    for(int j = 0; j < i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                System.out.print("请输入要打印的倒直角三角形的行数：");
                line = sc.nextInt();
                for(int i = 0; i <= line; i++){
                    for(int j = line; j > i; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                System.out.print("请输入要打印的倒直角三角形的行数：");
                line = sc.nextInt();
                for(int i = 0; i <= line; i++){
                    for(int k = 0; k < i; k++){
                        System.out.print(" ");
                    }
                    for(int j = line; j > i; j--){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.print("请输入要打印的等腰三角形的行数：");
                line = sc.nextInt();
                for(int i = 0; i <= line; i++){
                    for(int k = line; k > i; k--){
                        System.out.print(" ");
                    }
                    for(int j = 0; j < (2 * i - 1); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.print("请输入要打印的倒等腰三角形的行数：");
                line = sc.nextInt();
                for(int i = 1; i <= line; i++){
                    for(int k = 1; k < i; k++){
                        System.out.print(" ");
                    }
                    for(int j = (2 * i); j <= (2 * line); j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 6:
                System.out.println("请输入圆的半径:");
                int r = sc.nextInt();
                for (int y = 0; y <= 2 * r; y += 2) {//y的步长为2,改变y的步长可以将圆形变成椭圆
                    int x = (int)Math.round(r - Math.sqrt(2 * r * y - y * y));
                    int len = 2 * (r - x);
                    for (int i = 0; i <= x; i++) {
                        System.out.print(' ');
                    }
                    System.out.print('*');
                    for (int j = 0; j <= len; j++) {
                        System.out.print(' ');
                    }
                    System.out.println('*');
                }
                break;
        }
    }
}
