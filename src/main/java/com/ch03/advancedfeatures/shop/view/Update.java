package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.service.ShopUpdateService;
import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/6 12:12
 */
public class Update {
    public static void update(){
        System.out.println(">>>>>修改密码<<<<<");
        for (int i = 1; i <= 3; i++) {
            boolean flag = true;
            System.out.print("请输入旧密码：");
            String oldPassword = Input.sc.next();
            if (ShopUpdateService.isFlag(oldPassword)) {
                while (flag) {
                    System.out.print("请输入新密码：");
                    String newPassword = Input.sc.next();
                    System.out.print("请确认新密码：");
                    String newPassword1 = Input.sc.next();
                    if (newPassword.equals(newPassword1)) {
                        ShopUpdateService.update(oldPassword, newPassword);
                        flag = false;
                    } else {
                        System.out.println("两次输入密码不一致！");
                        flag = true;
                    }
                }
                if (!flag){
                    break;
                }
            } else {
                System.out.println("密码输入错误！");
            }
            if (i == 3){
                System.out.println("输入此数已达三次，程序结束！");
                System.exit(0);
            }
        }
    }
}
