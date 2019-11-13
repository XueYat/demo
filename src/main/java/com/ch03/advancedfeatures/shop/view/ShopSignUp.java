package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.service.ShopSignUpService;
import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/5 17:28
 */
class ShopSignUp {
    private static final int NUM = 160800;
    static void signUp(){
        System.out.println(">>>>>用户注册<<<<<");
        System.out.print("请输入姓名：");
        String name = Input.sc.next();
        System.out.print("请输入身份证号：");
        String cardId = Input.sc.next();
        if (ShopSignUpService.isExist(cardId)){
            String username = Integer.toString(NUM + (CustomerList.customerList.size() + 1));
            System.out.println("您的卡号为：" + username);
            while (true) {
                System.out.print("请输入卡密：");
                String password = Input.sc.next();
                if (password.length() >= 6 && password.length() <= 16) {
                    System.out.print("请再次输入卡密：");
                    String password1 = Input.sc.next();
                    if (password.equals(password1)) {
                        ShopSignUpService.signUpIsFlag(name, cardId, username, password, 0);
                        break;
                    } else {
                        System.out.println("两次输入的密码不一致！");
                    }
                } else {
                    System.out.println("密码长度为6~16位！");
                }
            }
        }
    }
}
