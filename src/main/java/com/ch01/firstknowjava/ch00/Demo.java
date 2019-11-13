package com.ch01.firstknowjava.ch00;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        /*int person = 250000 , year = 2012;
        while (person <= 1000000){
            person = person + (int)(person * 0.25);
            year++;
        }
        System.out.println("在" + year + "年增加到" + person + "人");*/

        /*int i = 0, sum = 0;
        while (i <= 100){
            sum = sum + i;
            i = i + 2;
        }
        System.out.println("100以内的偶数之和为：" + sum);*/

        /*int i = 1;
        double she = 0 , hua = 0;
        do {
            hua = she * 9 / 50 + 32;
            System.out.println("第" + i + "条：摄氏度：" + she + "\t\t\t华氏度：" + hua);
            she = she + 20;
            i++;
        }while (i <= 10);*/

        /*int val = 12345;
        int r , i = 0;
        System.out.println("反转后的整数是：");
        while (i < 5){
            r = val % 10;
            val = val / 10;
            System.out.print(r);
            i++;
        }*/

        /*int i = 0 , sum = 0;
        while (i <= 100){
            if(i % 3  == 0){
                System.out.print(i + "\t");
                sum = sum + i;
            }
            i++;
        }
        System.out.println("\n和为：" + sum);*/

        /*int sum = 0;
        for(int i = 0; i < 10; i++){
            sum = sum + i;
            if(sum >= 20){
                System.out.println("当前数是：" + i);
                break;
            }
        }*/

        /*int k = 1, l = 2, m = 0, n = 0;
        for(int i = 0; i < 5; i++){
            for(int j = i + 1; j <= 5; j++){
                if(j == i + 1){
                    m = l;
                    k = k + i;
                    n = k;
                    System.out.print(k + "\t");
                }else{
                    n = n + m;
                    System.out.print(n + "\t");
                    m++;
                }
            }
            l++;
            System.out.println();
        }*/

        /*int[] num = {8, 4, 2, 1, 22, 344, 12};
        int sum = 0;
        for(int i = 0; i < num.length; i++){
            sum += num[i];
            System.out.print(num[i] + "\t");
        }
        System.out.print("\n" + sum + "\t");

        System.out.print("\n请输入你要猜的数：");
        int shu = Input.nextInt();
        boolean flag = false;
        for(int i = 0; i < num.length; i++){
            if(shu == num[i]){
                flag = true;
            }
        }
        if(flag){
            System.out.println("恭喜您，猜对了！");
        }else{
            System.out.println("很遗憾，您猜错了!");
        }*/

        /*int[] score = new int[5];
        System.out.println("请输入5位同学的成绩：");
        for(int i = 0; i < score.length; i++) {
            score[i] = Input.nextInt();
        }
        System.out.print("5位同学成绩为:");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }
        System.out.print("\n成绩升序排序后为：");
        for(int i = 0; i < score.length - 1; i++){
            for(int j = 0; j < score.length - 1 - i; j++){
                if(score[j] > score[j + 1]){
                    int temp;
                    temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                }
            }
        }
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }

        Arrays.sort(score);
        System.out.print("\n成绩升序排序后为：");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }*/

        /*int[] list = new int[6];
        list[0] = 99;
        list[1] = 85;
        list[2] = 83;
        list[3] = 65;
        list[4] = 63;
        Arrays.sort(list , 0 , 5);
        int temp = 0 , num = 70;
        for(int i = 0; i < list.length; i++){
            if(num < list[i]){
                temp = i;
                break;
            }
        }
        System.out.println(temp);
        for(int i = list.length - 1; i > temp; i--){
            list[i] = list[i - 1];
        }
        list[temp] = num;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t\t");
        }*/


        /*char []  list  = new char[9];
        list[0] = 'Dog';
        list[1] = 'UpPet';
        list[2] = 'c';
        list[3] = 'e';
        list[4] = 'f';
        list[5] = 'p';
        list[6] = 'q';
        list[7] = 'z';
        char c = 'd';
        Arrays.sort(list , 0 , 8);
        int temp = 0;
        for(int i = 0; i < list.length; i++){
            if(c < list[i]){
                temp = i;
                break;
            }
        }
        System.out.println(temp);
        for(int i = list.length - 1; i > temp; i--){
            list[i] = list[i - 1];
        }
        list[temp] = c;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t\t");
        }*/

        /*int[] Dog = new int[]{1, 2, 3, 4};
        int[] UpPet = new int[4];
        UpPet = Arrays.copyOf(Dog , 4);
        for(int i = 0; i < UpPet.length; i++){
            System.out.println(UpPet[i]);
        }

        int index = Arrays.binarySearch(Dog, 3);
        System.out.println(index);*/

        /*int[] list = new int[6];
        int num = 0;
        int temp = 0;
        list[0] = 1;
        list[1] = 9;
        list[2] = 5;
        list[3] = 4;
        list[4] = 7;
        Arrays.sort(list , 0 , 5);
        System.out.print("请输入插入的数：");
        num = Input.nextInt();
        for(int i = 0; i < list.length; i++){
            if(num < list[i]){
                temp = i;
                break;
            }
        }
        System.out.println(temp);
        for(int i = list.length - 1; i > temp; i--){
            list[i] = list[i - 1];
        }
        list[temp] = num;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t\t");
        }*/

        /*int line = 0;
        System.out.print("请输入直角三角形的行数：");
        line = Input.nextInt();
        for(int i = 1; i <= line; i++){
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*int line = 0;
        System.out.print("请输入直角三角形的行数：");
        line = Input.nextInt();
        for(int i = 1; i <= line; i++){
            for(int k = 0; k < line - i; k++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i - 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        /*for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + "×" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }*/

        /*int[] score = new int[5];
        int temp = 0;
        System.out.println("请输入5名同学的成绩：");
        for(int i = 0; i< score.length; i++){
            score[i] = Input.nextInt();
        }

        for(int i = 0; i < score.length - 1; i++){
            for(int j = 0; j < score.length - 1 - i; j++){
                if(score[j] < score[j + 1]){
                    temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;
                }
            }
        }
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }*/

        /*double[] price = new double[3];
        int count = 0;
        for(int i = 1; i <= 3; i++){
            System.out.println("请输入第" + i + "个人所购商品的价格：");
            for(int j = 0; j < price.length; j++){
                price[j] = Input.nextDouble();
            }
            for(int k = 0; k < price.length; k++){
                if(price[k] > 300){
                    count++;
                }
            }
            System.out.println("第" + i + "个人有" + count + "件商品享受8折优惠！");
            count = 0;
        }*/


        /*int[] score = new int[5];
        System.out.println("请输入5位同学的成绩：");
        for(int i = 0; i < score.length; i++) {
            score[i] = Input.nextInt();
        }
        System.out.print("5位同学成绩为:");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }
        System.out.print("\n成绩升序排序后为：");
        for(int i = 0; i < score.length - 1; i++){
            for(int j = 0; j < score.length - 1 - i; j++){
                if(score[j] > score[j + 1]){
                    int temp;
                    temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                }
            }
        }
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }

        Arrays.sort(score);
        System.out.print("\n成绩升序排序后为：");
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }

        System.out.print("\n成绩降序排序后为：");
        for(int i = 0; i < score.length - 1; i++){
            for(int j = 0; j < score.length - 1 - i; j++){
                if(score[j] < score[j + 1]){
                    int temp;
                    temp = score[j];
                    score[j] = score[j + 1];
                    score[j + 1] = temp;

                }
            }
        }
        for(int i = 0; i < score.length; i++){
            System.out.print(score[i] + "\t\t");
        }*/

        /*int[] list = new int[6];
        int num = 0;
        int temp = 0;
        list[0] = 1;
        list[1] = 9;
        list[2] = 5;
        list[3] = 4;
        list[4] = 7;
        Arrays.sort(list , 0 , 5);
        System.out.print("请输入插入的数：");
        num = Input.nextInt();
        for(int i = 0; i < list.length; i++){
            if(num < list[i]){
                temp = i;
                break;
            }
        }
        System.out.println(temp);
        for(int i = list.length - 1; i > temp; i--){
            list[i] = list[i - 1];
        }
        list[temp] = num;
        for(int i = 0; i < list.length; i++){
            System.out.print(list[i] + "\t\t");
        }*/

        //System.out.println(Factorial.fact(5));

        int num1 = 2;
        int num2 = 2;
        System.out.println(String.format("%d / %d = %d", num1, num2, num1 / num2));

        int[] x = new int[3];
        int[] y = x;
        y[1] = 100;
        x[0] = 20;
        x = null;
        for (int i = 0; i < y.length; i++){
            System.out.print(y[i] + "、");
        }
        System.out.println();

        String str1 = "字符串";
        String str2 = "字符串";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("字符串");
        String str4 = new String("字符串");
        String str5 = str4;
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

        String str6 = "Hello Java";
        System.out.println(str6.replace("Hello Java", "World"));


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int start = 0, end = arr.length - 1; start < end; start++, end--){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
        for (int i = 0; i < arr.length; i++){
            //取消最后一个逗号
            if (i != arr.length-1) {
                System.out.print(arr[i] + ",");
            }
            else{
                System.out.println(arr[arr.length - 1]);
            }
        }


    }
    public static class Factorial {
        static int fact(int n){
            if (n==1){
                return 1;
            }else {
                return n * fact(n - 1);
            }
        }
    }
}
