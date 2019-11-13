package com.ch01.firstknowjava.ch06;

import java.util.*;

/**
 * @author YatXue
 */
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*int[] scores = {60, 80, 90, 70, 80};
        int sum = 0;
        double avg = 0;
        *//*for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }*//*
        //增强型for循环
        for (int score : scores){
            sum += score;
        }
        avg = sum / scores.length;
        System.out.println(avg);*/

        /*猜数游戏*/
        /*int[] nums = {8, 4, 2, 4, 23, 344, 12};
        int sum = 0;
        boolean flag = false;
        for (int num:
             nums) {
            sum += num;
            System.out.print(num + "\t");
        }
        System.out.println("\n所有数值和为：" + sum);
        System.out.print("请输入任意一个整数：");
        int num = sc.nextInt();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num){
                System.out.println("包含此数，数组下标为:" + i);
                flag = true;
            }
        }
        if (!flag){
            System.out.println("不包含此数");
        }*/


        /*System.out.print("请输入学生数：");
        int stuNum = sc.nextInt();
        double[] stuScore = new double[stuNum];
        for (int i = 0; i < stuScore.length; i++) {
            System.out.print("请输入第" + (i + 1) + "名学生的成绩：");
            stuScore[i] = sc.nextDouble();
        }
        double max = stuScore[0];
        for (int i = 0; i < stuScore.length; i++) {
            if (stuScore[i] > max){
                max = stuScore[i];
            }
        }
        System.out.println("最大值是：" + max);*/


        /*int[] stuScore = new int[6];
        stuScore[0] = 60;
        stuScore[1] = 90;
        stuScore[2] = 50;
        stuScore[3] = 80;
        stuScore[4] = 70;
        //定义一个变量，用来接收数据，进行替换
        int temp;
        //将数组进行降序排序
        for (int i = 0; i < stuScore.length - 1; i++) {
            for (int j = 0; j < stuScore.length - 1 - i; j++) {
                if (stuScore[j] < stuScore[j + 1]){
                    temp = stuScore[j];
                    stuScore[j] = stuScore[j + 1];
                    stuScore[j + 1] = temp;
                }
            }
        }
        temp = 0;
        System.out.print("降序排序后为：");
        for (int score:
             stuScore) {
            if (score != 0) {
                System.out.print(score + "\t");
            }
        }

        for (;;) {
            System.out.print("\n请输入要增加的学生成绩：");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                for (int i = 0; i < stuScore.length; i++) {
                    if (stuScore[i] <= score) {
                        temp = i;
                        break;
                    }
                }
                System.out.println("要增加的" + score + "分成绩在数组下标为" + temp + "位置上！");
                *//*for (int i = stuScore.length - 1; i > temp; i--) {
                    stuScore[i] = stuScore[i - 1];
                }*//*
                //src:源数组, srcPos:源数组要复制的起始位置, dest:目的数组, destPos:目的数组放置的起始位置, length:复制的长度.    可以实现我复制我自己
                System.arraycopy(stuScore, temp, stuScore, (temp + 1), (stuScore.length - temp - 1));
                stuScore[temp] = score;
                for (int score1:
                        stuScore) {
                    System.out.print(score1 + "\t");
                }
                break;
            } else {
                System.out.print("请输入0-100之间的数！");
            }
        }*/


        /*System.out.println("请输入4家店的价格：");
        int[] price = new int[4];
        for (int i = 0; i < price.length; i++) {
            System.out.print("请输入第" + (i + 1) + "店的价格：");
            price[i] = sc.nextInt();
        }
        int min = price[0];
        int shop = 0;
        for (int i = 0; i < price.length; i++) {
            if (min > price[i]){
                min = price[i];
                shop = i + 1;
            }
        }
        System.out.println("第" + shop + "家店的价格最低，最低价为：" + min + "￥");*/


        /*System.out.println("请输入会员本月的消费记录");
        double[] num = new double[5];
        for (int i = 0; i < num.length; i++) {
            System.out.print("请输入第" + (i + 1) + "笔购物金额：");
            num[i] = sc.nextDouble();
        }

        double sum = 0;
        System.out.println("序号\t\t金额(元)");
        for (int i = 0; i < num.length; i++) {
            System.out.println((i + 1) + "\t\t" + num[i]);
            sum += num[i];
        }
        System.out.println("总金额\t" + sum);*/


        /*//声明并开辟空间
        int[] scores = new int[5];
        for (int i = 0, len = scores.length; i < len; i++) {
            System.out.print("请输入第" + (i + 1) + "个数：");
            scores[i] = sc.nextInt();
        }

        *//*
         * 遍历数组
         * *//*
        int i = 1;
        for (int score:
             scores) {
            System.out.println("第" + i++ + "个数为：" + score);
        }*/


        /*int[] scores = new int[5];
        for (int i = 0, len = scores.length; i < len; i++) {
            System.out.print("请输入第" + (i + 1) + "位同学的成绩：");
            scores[i] = sc.nextInt();
        }
        int max = scores[0];
        for (int score:
                scores) {
            if (score > max){
                max = score;/
            }
        }
        System.out.println("最大成绩为：" + max);*/


        int[] stuScores = {2, 6, 4, 8, 0};
        Arrays.sort(stuScores);
        System.out.println(Arrays.toString(stuScores));

    }
}
