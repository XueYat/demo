package com.ch01.firstknowjava.ch01;

import java.util.Scanner;

public class FirstDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("你好，我是青鸟学院");
        System.out.println("姓名：爱编程");
        System.out.println("年龄：20岁");
        System.out.println("爱好：打篮球");
        double score = 98.5;
        String name = "张三";
        String sex = "男";
        System.out.println("姓名：" + name + "，性别：" + sex + "，成绩：" + score);

        System.out.print("请输入您的姓名：");
        name = sc.next();
        System.out.print("请输入您的成绩：");
        score = sc.nextDouble();
        System.out.println("您的姓名为：" + name + "，您的成绩为：" + score);
        System.out.println("我" == "我");

		/*System.out.print("请输入您要输入的数：");
		int cardID = sc.nextInt();
		int number = cardID;
		int ge = number % 10;
		int shi = number / 10 % 10;
		int bai = number / 100 % 10;
		int qian = number / 1000;
		System.out.println("个：" + ge);
		System.out.println("十：" + shi);
		System.out.println("百：" + bai);
		System.out.println("千：" + qian);
		System.out.println("卡号为：" + number + "的各位之和为：" + (ge + shi + bai + qian));*/

		/*int sum = 0;
		int numberOfLength = String.valueOf(number).length();
		int[] a = new int[numberOfLength];
		for(int i = 0; i < numberOfLength; i++){
			a[i] = number % 10;
			number = number / 10;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			sum = sum + a[i];
		}
		System.out.println(cardID + "各位的和为：" + sum);

		System.out.println("个：" + a[0]);
		System.out.println("十：" + a[1]);
		System.out.println("百：" + a[2]);
		System.out.println("千：" + a[3]);
		String score;
		score = sum > 20 ? "恭喜您，卡号为：" + cardID +  "的会员中奖了，奖品是MP3一个" : "没有中奖";
		System.out.println(score);*/

		/*System.out.println("请输入一个整数：");
		int shu = sc.nextInt();
		String result = "";
		int shu1 = shu % 2;
		result = shu1 == 0 ? "该数是偶数" : "该数是奇数";
		System.out.println(result);*/

        System.out.print("请输入单价：");
        double price = sc.nextDouble();
        System.out.print("请输入数量：");
        int num = sc.nextInt();
        double prices = price * num;
        System.out.println("总价为：" + prices);
        double zk;
        zk = prices >= 500 ? 0.8 : 1;
        String msg;
        msg = zk == 0.8 ? "总价超过500元，折扣为8折，折后价为：" + (prices * zk) : "总价未超过500元，不享受折扣，应付：" + prices;
        System.out.println(msg);
        System.out.print("请输入付款金额：");
        double money = sc.nextDouble();
        double zl = money - (prices * zk);
        System.out.println("找零：" + zl);


    }
}