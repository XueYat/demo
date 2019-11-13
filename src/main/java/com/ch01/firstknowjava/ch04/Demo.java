package com.ch01.firstknowjava.ch04;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 1, sum = 0;
		String answer;

		/*while (i <= 50) {
			System.out.println("正在打印第 " + i + "份试卷...");
			i++;
		}*/

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
            System.out.print("成绩是否合格？(y/n)");
            answer = sc.next();
        }while (answer.equals("n"));
        System.out.println("合格");

        System.out.print("请输入一个值：");
        int num = sc.nextInt();
        for (int j = 0; j <= num; j++) {
			System.out.println(j + " + " + (num - j) + " = " + num);
		}*/

		/*// while循环
		while (i <= 100) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println(sum);
		i = 1;
		sum = 0;

		// do-while循环
		do {
			if (i % 2 == 0) {
				sum = sum + i;
			}
			i++;
		} while (i <= 100);
		System.out.println(sum);
		i = 1;
		sum = 0;

		// for循环
		for (; i <= 100; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);*/

		System.out.print("请输入学生姓名：");
		String stuName = sc.next();
		double stuScore, stuSum = 0, stuAvg;
		for (int j = 1; j <= 5; j++) {
			System.out.print("请输入第" + j + "门课程成绩：");
			stuScore = sc.nextDouble();
			stuSum = stuSum + stuScore;
		}
		stuAvg = stuSum / 5;
		System.out.println(stuName + "的平均成绩是：" + stuAvg);

		int f = 0;
		int t = 0;
		for(int j = 0; j <= 100; j++) {
			if(j % 2 == 0) {
				f = f + j;
			}else{
				t += j;
			}
		}
		System.out.println("偶数和：" + f);
		System.out.println("奇数和：" + t);
		f = 0;
		t = 0;

		int num = 0;
		while (num <= 100) {
			if (num % 2 == 0) {
				f += num;
			}else {
				t += num;
			}
			num++;
		}
		System.out.println("偶数和：" + f);
		System.out.println("奇数和：" + t);


		for (int w = 1; w <= 100; w++) {
			if((w - 1) % 25 == 0) {
				System.out.println();
			}
			if(w % 5 == 0) {
				System.out.print(w + "\t");
			}
		}


		System.out.println();
		for(int a = 1; a <= 5; a++) {
			for(int b = 0; b <= 4; b++) {
				System.out.print(a+"  ");
			}
			System.out.println();
		}


		System.out.println();
		for(int a = 1; a <= 9; a++) {
			for(int b = 1; b <= 9; b++) {
				System.out.print(a + "*" + b + "=" + (a * b) + "\t");
			}
			System.out.println();
		}


		System.out.println();
		for(int n = 1; n <= 9; n++) {
			for(int m = 1; m <= n; m++) {
				System.out.print(n + "*" + m + "=" + (m * n) + "\t");
			}
			System.out.println();
		}


		int count = 0, sum1 = 0;
		for (int k = 1; k <= 100; k++) {
			if (k % 2 == 0) {
				count++;
				sum1 += k;
				System.out.print(k + "、");
			}
		}
		System.out.println("\n" + sum1);
		System.out.println("\n总共有" + count + "个偶数");

		for (int j = 0; j < 10; j++) {
			if (j > 5) {
				break;
			}
			System.out.print(j);
		}

		System.out.println();
		int x = 0;
		for (testA('a'); testA('b') && (x < 2); testA('c')) {
			x++;
			testA('d');
		}
	}

	public static boolean testA(char a){
		System.out.print(a);
		return true;
	}
}
