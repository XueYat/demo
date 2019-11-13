package com.ch01.firstknowjava.ch03;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		/*int javaScore = 0, musicScore = 0;
		System.out.println("请输入Java成绩：");
		javaScore = sc.nextInt();
		System.out.println("请输入音乐成绩：");
		musicScore = sc.nextInt();

		if (javaScore > 90 && musicScore > 80 || javaScore == 100
				&& musicScore > 70) {
			System.out.println("奖励！");
		} else {
			System.out.println("惩罚！");
		}

		if (javaScore >= 80) {
			System.out.println("优秀");
		} else if (javaScore >= 70) {
			System.out.println("良好");
		} else if (javaScore >= 60) {
			System.out.println("及格");
		} else if (javaScore < 60 && javaScore >= 0) {
			System.out.println("差");
		} else if (javaScore < 0) {
			System.out.println("输入错误");
		}*/


		/*String answer = "y";
		while (answer.equals("y")) {
			System.out.print("请输入笔试成绩：");
			double bScore = sc.nextDouble();
			if (bScore >= 90) {
				System.out.println("笔试通过，进入面试！");
				System.out.print("请输入面试成绩：");
				double mScore = sc.nextDouble();
				if (mScore >= 90) {
					System.out.println("面试通过，上班！");
					break;
				} else {
					System.out.println("面试失败，很遗憾！");
				}
			} else {
				System.out.println("笔试失败，很遗憾！");
			}
			System.out.println("是否继续？(y/n)");
			answer = sc.next();
		}*/


		/*System.out.print("请输入跑步成绩：");
		double time = sc.nextDouble();
		if (time <= 10) {
			System.out.println("你有资格进入决赛！");
			System.out.print("请输入性别：");
			String sex = sc.next();
			if (sex.equals("男")) {
				System.out.println("进入男子组！");
			} else {
				System.out.println("进入女子组！");
			}
		} else {
			System.out.println("你没有资格进入决赛！");
		}*/


		/*System.out.print("请输入名次：");
		int num = sc.nextInt();
		switch (num) {
			case 1:
				System.out.println("参加麻省理工大学组织的1个月夏令营");
				break;
			case 2:
				System.out.println("惠普笔记本电脑一部");
				break;
			case 3:
				System.out.println("移动硬盘一个");
				break;
			default:
				System.out.println("谢谢参与");
				break;
		}*/


		/*System.out.print("今天是星期几：");
		int day = sc.nextInt();
		switch (day) {
			case 1:
			case 3:
			case 5:
			case 7:
				System.out.println("今天是星期" + day + "，吃面食");
				break;
			case 2:
			case 4:
			case 6:
				System.out.println("今天是星期" + day + "，吃盖饭");
		}*/

		/*System.out.println("我行我素购物管理系统 > 幸运抽奖");
		System.out.print("请输入四位会员号:");
		int vipID = sc.nextInt();
		int bai = vipID / 100 % 10;
		int random = (int) (Math.random() * 10);
		if (bai == random) {
			System.out.println(vipID + "号客户是幸运用户，获得精美MP3一个！");
		} else {
			System.out.println(vipID + "号客户，感谢您的参与！");
		}*/

		// System.out.println(bai);
		// System.out.println(random);


		/*System.out.print("请输入月份：");
		int month = sc.nextInt();
		switch (month) {
			case 3:
			case 4:
			case 5:
				System.out.println("春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("东季");
				break;
		}*/


		/*System.out.print("请输入小朋友年龄：");
		int age = sc.nextInt();
		if (age > 7) {
			System.out.println("可以搬动桌子了");
		}else if (age > 5) {
			System.out.println("年龄大于5岁");
			System.out.print("请输入性别：");
			String sex = sc.next();
			if (sex.equals("男")) {
				System.out.println("可以搬动桌子了");
			}else {
				System.out.println("女孩子搬不动");
			}
		}else {
			System.out.println("年龄太小");
		}*/


		/*System.out.print("请输入年龄：");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("可以查看！");
		}else if (age < 10) {
			System.out.println("不允许查看！");
		}else if (age >=10) {
			System.out.print("是否继续查看？(yes/no)");
			String answer = sc.next();
			if (answer.equals("yes")) {
				System.out.println("可以查看!");
			}else {
				System.out.println("不允许查看！");
			}
		}*/


		/*System.out.print("请输入用户名：");
		String username = sc.next();
		System.out.print("请输入密码：");
		String password = sc.next();
		if (username.equals("admin")) {
			if (password.equals("888")) {
				System.out.println("正确！");
			}else {
				System.out.println("错误！");
			}
		}else {
			System.out.println("用户不存在！");
		}*/

		System.out.print("请输入用户名：");
		String uName = sc.nextLine();
		System.out.print("请输入密码：");
		String pwd = sc.nextLine();
		if ("admin".equals(uName)) {
			if ("888".equals(pwd)) {
				System.out.println("登录成功！");
			}else {
				System.out.println("密码错误！");
			}
		}else {
			System.out.println("用户名不存在！");
		}



	}
}
