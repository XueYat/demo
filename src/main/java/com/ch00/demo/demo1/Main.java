package com.ch00.demo.demo1.Demo;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*String name = "";
        int goodsNo , number , integral;
        double price = 0, sum = 0, money = 0, change, payfor, discount = 0.8;
        System.out.println("*******************************************");
        System.out.println("\t\t\t请选择购买的商品编号：\n");
        System.out.println("\t\t1.T恤   2. 网球鞋  3. 网球拍");
        System.out.println("******************************************\n");
        String answer = "y";
        while (answer.equals("y")) {
            System.out.print("请输入商品编号： ");
            goodsNo = Input.nextInt();
            System.out.print("请输入购买数量： ");
            number = Input.nextInt();
            switch (goodsNo) {
                case 1:
                    name = "T恤";
                    price = 245;
                    break;
                case 2:
                    name = "网球鞋";
                    price = 570;
                    break;
                case 3:
                    name = "网球拍";
                    price = 320;
                    break;
            }
            System.out.println("名称\t\t" + "单价\t\t\t" + "总价");
            System.out.println(name + "\t\t" + "￥" + price + "\t\t" + "￥" + price * number); // 输出商品名称和价格
            for(;;) {
                System.out.print("是否继续（y/n）");
                answer = Input.next();
                if (answer.equals("y") || answer.equals("n")) {
                    break;
                }else{
                    System.out.println("请按提示输入！");
                }
            }
            sum = sum + price * number;
            money = (money + sum) * discount;
        }
        System.out.println("金额总计：￥" + money);
        System.out.println("折扣：￥" + discount);
        for (; ; ){
            System.out.print("实际交费：￥");
            payfor = Input.nextDouble();
            if (payfor >= money) {
                change = payfor - money;
                System.out.println("找钱：￥" + change);
                break;
            } else {
                System.out.println("请缴纳足够的金额！");
            }
        }
        integral = (int)((int)money * 0.5);
        System.out.println("积分为：" + integral);*/

        /*System.out.print("请输入四位会员号：" );
        int[] Dog=new int[4];
        int com.day.Demo11.dao = Input.nextInt();
        int ge , shi , bai , qian , sum , user1;
        int num = (int)(Math.random() * 10);*/
        /*qian = com.day.Demo11.dao / 1000;
        bai = com.day.Demo11.dao % 1000 / 100;
        shi = com.day.Demo11.dao % 100 / 10;
        ge = com.day.Demo11.dao % 10;
        sum = ge + shi + bai + qian;*/
        /*user1 = com.day.Demo11.dao;
        for(int k = 0 ; k < 4 ; k++){
            Dog[k] = user1 % 10;
            user1 = user1 / 10;
        }
        System.out.println(com.day.Demo11.dao+"的个位数:" + Dog[0]);
        System.out.println(com.day.Demo11.dao+"的十位数:" + Dog[1]);
        System.out.println(com.day.Demo11.dao+"的百位数:" + Dog[2]);
        System.out.println(com.day.Demo11.dao+"的千位数:" + Dog[3]);
        System.out.println("随机数是：" + num);
        sum = Dog[0] + Dog[1] + Dog[2] + Dog[3];
        if(Dog[2] == num){
            System.out.print("是幸运顾客" );
        }else{
            System.out.print("不是幸运顾客" );
        }*/

        /*System.out.print("请输入存款：");
        int money = Input.nextInt();
        if(money > 5000000){
            System.out.println("凯迪拉克");
        }else if(money > 1000000 && money < 5000000){
            System.out.println("帕萨特");
        }else if(money > 500000 && money < 1000000){
            System.out.println("伊兰特");
        }else if(money > 100000 && money < 500000){
            System.out.println("奥拓");
        }else if(money < 100000){
            System.out.println("捷安特");
        }*/

        /*String answer;
        double money , payfor;
        System.out.print("请输入是否是会员：(y/其他字符)");
        answer = Input.next();
        if(answer.equals("y")){
            System.out.print("请输入购物金额：");
            money = Input.nextInt();
            if(money > 200){
                payfor = money * 0.75;
                System.out.print("实际支付：" + payfor);
            }else{
                payfor = money * 0.8;
                System.out.print("实际支付：" + payfor);
            }
        }else{
            System.out.print("请输入购物金额：");
            money = Input.nextInt();
            payfor = money * 0.9;
            System.out.print("实际支付：" + payfor);
        }*/

        /*System.out.println("\t\t\t欢迎进入我行我素购物管理系统");
        System.out.println("***********************************************");
        System.out.println("\t\t\t\t\t1.登录");
        System.out.println("\t\t\t\t\t2.退出");
        System.out.println("***********************************************");
        System.out.print("请输入：");
        int num;
        num = Input.nextInt();
        switch (num){
            case 1:
                System.out.println("登录成功");
                System.out.println("***********************************************");
                System.out.println("\t\t\t\t1.客户信息管理");
                System.out.println("\t\t\t\t2.购物结算");
                System.out.println("\t\t\t\t3.真情回馈");
                System.out.println("\t\t\t\t4.退出");
                System.out.println("***********************************************");
                System.out.print("请输入：");
                num = Input.nextInt();
                switch (num){
                    case 1:
                        System.out.println("购物管理系统>>>客户信息管理");
                        System.out.println("***********************************************");
                        System.out.println("\t\t\t\t1.显示所有客户");
                        System.out.println("\t\t\t\t2.添加客户信息");
                        System.out.println("\t\t\t\t3.修改客户信息");
                        System.out.println("\t\t\t\t4.查询客户信息");
                        System.out.println("\t\t\t\t5.退出");
                        System.out.println("***********************************************");
                        System.out.print("请输入：");
                        num = Input.nextInt();
                        switch (num){
                            case 1:
                                System.out.println("执行显示所有客户操作");
                                break;
                            case 2:
                                System.out.println("执行添加客户信息操作");
                                break;
                            case 3:
                                System.out.println("执行修改客户信息操作");
                                break;
                            case 4:
                                System.out.println("执行查询客户信息操作");
                                break;
                            case 5:
                                System.out.println("执行退出操作");
                                break;
                        }
                        break;
                    case 2:
                        System.out.println("执行购物结算操作");
                        break;
                    case 3:
                        System.out.println("执行真情回馈操作");
                        break;
                    case 4:
                        System.out.println("执行退出操作");
                        break;
                }
                break;
            case 2:
                System.out.println("结束程序");
                break;
        }*/

    }
}