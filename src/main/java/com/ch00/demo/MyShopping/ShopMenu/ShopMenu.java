package com.ch00.demo.MyShopping.ShopMenu;

import com.ch00.demo.MyShopping.Lottery.Lottery;
import com.ch00.demo.MyShopping.ShopMoney.ShopMoney;
import com.ch00.demo.MyShopping.UserInfo.UserInfo;
import java.util.Scanner;

public class ShopMenu {
    private static UserInfo userInfo = new UserInfo();
    private static ShopMoney shopMoney = new ShopMoney();
    private static Lottery lottery = new Lottery();
    public void ShopMenuDisplay(){
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("\n\n\t\t\t\t\t\t欢迎使用我行我素购物管理系统\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.println("\t\t\t\t\t\t 1. 客 户 信 息 管 理\n");
        System.out.println("\t\t\t\t\t\t 2. 购 物 结 算\n");
        System.out.println("\t\t\t\t\t\t 3. 真 情 回 馈\n");
        System.out.println("\t\t\t\t\t\t 4. 退 出\n");
        System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
        System.out.print("请选择，输入数字：");
        number = scanner.nextInt();
        if (number == 1) {
            userInfo.UserInfoDisplay();
        } else if (number == 2) {
            shopMoney.ShopMoneyDisplay();
        } else if (number == 3) {
            lottery.LotteryDisplay();
        } else if (number == 4) {
            System.out.println("系统退出！");
        }
    }
}
