package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.service.ShopSignInService;
import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/5 17:28
 */
class ShopSignIn {
    static void signIn(){
        for (int i = 1; i <= 3; i++) {
            System.out.println(">>>>>用户登录<<<<<");
            System.out.print("请输入卡号：");
            String username = Input.sc.next();
            System.out.print("请输入卡密：");
            String password = Input.sc.next();
            if(!ShopSignInService.signInIsFlag(username, password)) {
                ShopView.shopView();
            }
            if (i == 3){
                System.out.println("输入此数已达三次，程序结束！");
                System.exit(0);
            }
        }
    }
}
