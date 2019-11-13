package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/6 11:45
 */
public class ShopView {
    public static void shopView(){
        boolean flag = true;
        while (flag) {
            int num = 0;
            System.out.println("**********超市会员管理系统**********");
            System.out.println();
            System.out.println("\t\t\t1.购物结算");
            System.out.println();
            System.out.println("\t\t\t2.积分兑换");
            System.out.println();
            System.out.println("\t\t\t3.修改密码");
            System.out.println();
            System.out.println("\t\t\t4.退出登录");
            System.out.println();
            System.out.println("**********************************");
            System.out.print("请选择：");
            try {
                num = Integer.parseInt(Input.sc.next());
            } catch (Exception ignored) { }
            switch (num) {
                case 1:
                    SettleAccounts.settleAccounts();
                    break;
                case 2:
                    Convert.convert();
                    break;
                case 3:
                    Update.update();
                    break;
                case 4:
                    System.out.println("退出登录！");
                    ShopMain.main();
                    flag = false;
                    break;
                default:
                    System.out.println("请按提示输入！");
            }
        }
    }
}
