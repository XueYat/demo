package com.ch02.objectoriented.ch07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/28 9:59
 */
public class Calculator {

    void calculate() throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入被除数：");
        int num1 = sc.nextInt();
        System.out.print("请输入被除数：");
        int num2 = sc.nextInt();
        System.out.println(num1 + "/" + num2 + "=" + num1 / num2);
    }
}