package com.ch01.firstknowjava.ch05;

import java.util.Scanner;

/**
 * Demo11 class
 *
 * @author XueYat
 * @date 2019/3/11
 * */

public class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		/*System.out.print("请输入图形的行数：");
		int line = sc.nextInt();*/


		/*for (int i = 1; i <= line ; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= line; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*for (int i = 1; i <= line; i++) {
			for (int j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/


		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				continue;
			}else {
				sum = sum + i;
			}
		}
		System.out.println("1-10之间的偶数和为：" + sum);*/


		//九九乘法表
		/*for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}*/

		/*for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9 - i; j++) {
				System.out.print("     \t");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + (i * j) + "\t");
			}
			System.out.println();
		}*/


		/*System.out.print("请输入姓名：");
		String stuName = sc.next();
		double score, avg, sum = 0;
		boolean flag = true;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入第" + i + "门课的成绩：");
			score = sc.nextDouble();
			if (score < 0){
				flag = false;
				System.out.println("请输入正确的成绩！");
				break;
			}
			sum += score;
		}
		if (flag){
			avg = sum / 5;
			System.out.println(stuName + "的均分为：" + avg);
		}*/


		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
			if (sum > 20){
				System.out.println(i);
				break;
			}
		}*/


		/*System.out.print("请输入班级人数：");
		int stuNum = sc.nextInt();
		double score = 0;
		int count = 0;
		for (int i = 1; i <= stuNum; i++) {
			System.out.print("请输入第" + i + "名学生的成绩：");
			score = sc.nextInt();
			if (score < 80){
				continue;
			}
			count++;
		}
		System.out.println("80分以上的学生人数为：" + count);
		System.out.println("80分以上的学生所占比例为：" + ((double)count / (double)stuNum) * 100 + "%");*/


		/*int sum = 0;
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0){
				continue;
			}else {
				sum += i;
			}
			System.out.println("当前i的值为：" + i);
		}
		System.out.println("1-10之间的偶数之和为：" + sum);*/


		/*System.out.print("for循环实现：\t");
		for (int i = 100; i >= 1; i--) {
			if (i % 5 == 0) {
				System.out.print(i + "\t");
			}
		}
		System.out.println();


		System.out.print("while循环实现：\t");
		int i = 100;
		while (i >= 1){
			if (i % 5 == 0){
				System.out.print(i + "\t");
			}
			i--;
		}
		System.out.println();
		i = 100;


		System.out.print("do-while循环实现：\t");
		do {
			if (i % 5 == 0){
				System.out.print(i + "\t");
			}
			i--;
		}while (i >= 1);*/


		/*boolean flag = true;
		while (flag){
			System.out.print("请输入1~7之间的数字，输入0退出程序：");
			int num = sc.nextInt();
			if (num >= 0 && num <= 7) {
				switch (num) {
					case 0:
						System.out.println("程序结束");
						flag = false;
						break;
					case 1:
						System.out.println("星期一");
						break;
					case 2:
						System.out.println("星期二");
						break;
					case 3:
						System.out.println("星期三");
						break;
					case 4:
						System.out.println("星期四");
						break;
					case 5:
						System.out.println("星期五");
						break;
					case 6:
						System.out.println("星期六");
						break;
					case 7:
						System.out.println("星期日");
						break;
					default:
				}
			}else {
				System.out.println("您输入的数字不合格，只能输入1~7范围的数！");
			}
		}*/


		/*System.out.print("你想要几行数字：");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				System.out.print(i);
			}
			System.out.println();
		}*/


			for (int i = 1; i <= 10; i++) {
				System.out.println("第" + i + "圈");
				System.out.print("能否坚持？(y/n)");
				String answer = sc.next();
				if (answer.equals("n")){
					System.out.println("第" + i + "圈了，快累死了，我要退出");
					System.out.println("退出比赛！");
					break;
				}
			}

	}
}