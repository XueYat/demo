package com.ch03.advancedfeatures.shop.service;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.model.Customer;
import com.ch03.advancedfeatures.shop.view.ShopView;

/**
 * @author YatXue
 * @date 2019/4/5 18:08
 */
public class ShopSignInService {
    public static String username;
    public static boolean signInIsFlag(String username, String password){
        boolean flag = true;
        for (Customer customer : CustomerList.customerList) {
            if (username.equals(customer.getUsername()) && password.equals(customer.getPassword())){
                System.out.println("登陆成功！");
                ShopSignInService.username = username;
                flag = false;
            }
        }
        if (flag){
            System.out.println("卡号或卡密错误，请重新输入！");
        }
        return flag;
    }
}
