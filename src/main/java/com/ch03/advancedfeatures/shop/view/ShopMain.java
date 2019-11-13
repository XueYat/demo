package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/5 16:22
 */
public class ShopMain {
    public static void main(){
        boolean flag = true;
        while (flag) {
            int num = 0;
            System.out.println("*********超市会员管理系统*********");
            System.out.println();
            System.out.println("\t\t\t1.登\t录");
            System.out.println();
            System.out.println("\t\t\t2.开\t卡");
            System.out.println();
            System.out.println("\t\t\t3.退\t出");
            System.out.println();
            System.out.println("********************************");
            System.out.print("请选择：");
            try{
                num = Integer.parseInt(Input.sc.next());
            }catch (Exception ignored){ }
            switch (num) {
                case 1:
                    ShopSignIn.signIn();
                    break;
                case 2:
                    ShopSignUp.signUp();
                    break;
                case 3:
                    System.out.println("程序结束！");
                    flag = false;
                    break;
                default:
                    System.out.println("请按提示输入！");
            }
        }
    }
}
