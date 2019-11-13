package com.ch00.demo.MyShopping.ShopMoney;

import com.ch00.demo.MyShopping.ShopMenu.ShopMenu;
import java.util.Scanner;

public class ShopMoney {
    private static ShopMenu shopMenu = new ShopMenu();
    private int[] shopNo = new int[10];
    private String[] shopName = new String[10];
    private double[] shopPrice = new double[10];
    private Scanner scanner = new Scanner(System.in);
    public void ShopMoneyDisplay(){
        int no, num;
        double price, sum, money, zk = 0.8;
        String answer;
        shopNo[0] = 1;
        shopNo[1] = 2;
        shopNo[2] = 3;
        shopName[0] = "java";
        shopName[1] = "python";
        shopName[2] = "ASP.NET";
        shopPrice[0] = 20;
        shopPrice[1] = 15;
        shopPrice[2] = 10;
        System.out.println("\n购物结算\n");
        System.out.println("商品编号\t|\t商品名称\t|\t商品价格");
        for (int i = 0; i < shopNo.length; i++){
            if (shopNo[i] != 0){
                System.out.println(shopNo[i] + "\t\t|\t" + shopName[i] + "\t|\t" + shopPrice[i]);
            }
        }
        answer = "y";
        sum = 0;
        while (answer.equals("y")) {
            System.out.print("请输入您要购买的商品编号：");
            no = scanner.nextInt();
            System.out.print("请输入您要购买的商品数量：");
            num = scanner.nextInt();
            price = shopPrice[no - 1] * num;
            System.out.println("您选择购买" + num + "件编号为" + no + "的商品，总价为：" + price);
            System.out.println("是否继续(y/n)");
            answer = scanner.next();
            sum = sum + price;
        }
        System.out.println("金额总计：" + sum);
        double zhj = sum * zk;
        System.out.println("折扣为8折，折后价：" + zhj);
        for (;;) {
            System.out.print("实付金额：");
            money = scanner.nextDouble();
            if (money >= zhj) {
                System.out.println("找零：" + (money - zhj));
                break;
            } else {
                System.out.println("您的钱不够！");
            }
        }
        shopMenu.ShopMenuDisplay();
    }
}
