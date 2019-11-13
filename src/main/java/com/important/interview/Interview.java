package com.important.interview;

import java.math.BigInteger;
import java.util.Scanner;

public class Interview {
	static Scanner sc = new Scanner(System.in);

	//3.说说&和&&的区别
	public static void test3(){
		String str = null;
		int x = 1, y = 1;
		for(;;){
			if (str != null && !str.equals("")) {
				System.out.println("true");
			}else{
				System.out.println("false");
			}
		}
	}

	//4.在java中如何跳出当前的多重嵌套循环
	public static int test4(){
		System.out.println("①");
		ok : for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println("i=" + i + ",j=" + j);
				if (j == 5)
					break ok;	//在外层循环前定义一个标号，在里层循环体的代码中使用带有标号的break语句，即可跳出循环
			}
		}

		System.out.println("②");
		int arr[][] = {{1, 2, 3}, {4, 5, 6, 7}, {9}};
		boolean found = false;
		for (int i = 0; i < arr.length && !found; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 5) {
					found = true;	//让外层循环条件表达式的结果可以收到里层循环体代码的控制。当存在数字5时，found赋值true，循环跳出
					System.out.println("数字5存在！");
					break;
				}
			}
		}

		System.out.println("③");
		int count = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				count++;
				System.out.println("i=" + i + ",j=" + j);
				if (j == 5) {
					return count;	//利用返回值进行跳出循环
				}
			}
		}
		return 0;
	}

	//6.=和+=的区别
	public static void test6(){
		short s1 = 1;
		//s1 = s1 + 1;	//由于s1+1运算时会自动提升表达式的类型，所以结果是int型，编译器报告需要强制转换类型错误
		s1 += 1;	//由于+=是java语言规定的运算符，java编译器会对它进行特殊处理，因此可以正确编译
		System.out.println(s1);
	}

	//7.char型变量中能不能存贮一个中文汉字
	public static void test7(){
		char text = 'k';	//
		System.out.println(text);
		System.out.println("k".getBytes());
		System.out.println("啦".getBytes());
	}

	//8.用最有效率的方法算出2乘以8等于几
	public static void test8(){
		int result = 2 << 3;	//将2转换成2进制，向左移动3位
		System.out.println(result);
	}

	//9.设计100亿的计算器
	public static void test9(){
		BigInteger result, a, b;
		a = new BigInteger("10000000000");
		b = new BigInteger("10000000000");
		result = b.add(b);
		System.out.println("a=" + a + "\nb=" + b + "\na+b=" + result);
	}

	//10.使用final关键字修饰一个变量时，是引用不能变，还是引用的对象不能变
	public static void test10(){
		final StringBuffer a = new StringBuffer("Hello");
		//a = new StringBuffer("World");	//引用变量不能重新赋值
		a.append("world");	//引用指向的对象的内容可以变化;append()方法在被选元素的结尾(仍然在内部)插入指定内容
		System.out.println(a);
	}

	//11.==和equals的区别
	public static void test11(){
		int a = 1, b = 1;
		System.out.println(a == b);//对于==，比较的是值是否相等；如果作用于基本数据类型的变量，则直接比较其存储的 “值”是否相等；如果作用于引用类型的变量，则比较的是所指向的对象的地址

		String i = null, j = "admin";//对于equals方法，注意：equals方法不能作用于基本数据类型的变量，equals继承Object类，比较的是是否是同一个对象；如果没有对equals方法进行重写，则比较的是引用类型的变量所指向的对象的地址；诸如String、Date等类对equals方法进行了重写的话，比较的是所指向的对象的内容
		try {
			System.out.println(i.equals(j));
		} catch (Exception e) {
			System.out.println("空指针异常");
		}
	}

	//13.是否可以从一个static方法内部发出对非static方法的调用
	public static void test13_1(){	//不可以，static方法调用时不需要创建对象，直接调用即可
		test13_2();
	}

	public static void test13_2(){	//非static方法是与对象关联在一起的，必须创建一个对象后，才可以在该对象上进行方法调用
		System.out.println("调用成功");	//因此，当一个static方法被调用时，还没有创建任何实例对象，如果从一个static方法发出对非static方法的调用，那这个非static方法是不知道关联到哪个对象上的，逻辑无法成立
	}

	//15.Math.round(11.5)和Math.round(-11.5)的结果
	public static void test15(){
		System.out.println(Math.round(11.5));	//Math.round()即是四舍五入，向下取整
		System.out.println(Math.round(-11.5));
	}

	//16.
	public static boolean test16(){
		String username = null;	//username可能为空，equals左边不能为空
		try {
			if (username.equals("admin")) {
				System.out.println("true");
			}
		} catch (Exception e) {
			System.out.println("空指针异常");
		}
		if ("admin".equals(username)) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}

		int x = 1;
		System.out.println(x == 1);
		return x == 1 ? true : false;	//直接return x == 1就可以
	}
}
