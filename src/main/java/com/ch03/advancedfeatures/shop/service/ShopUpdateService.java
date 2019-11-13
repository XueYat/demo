package com.ch03.advancedfeatures.shop.service;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.model.Customer;

/**
 * @author YatXue
 * @date 2019/4/6 13:27
 */
public class ShopUpdateService {
    public static boolean isFlag(String password){
        boolean flag = false;
        for (Customer customer : CustomerList.customerList) {
            flag = (customer.getUsername().equals(ShopSignInService.username) && customer.getPassword().equals(password));
            if (flag){
                break;
            }
        }
        return flag;
    }
    
    public static void update(String oldPassword, String newPassword){
        for (Customer customer : CustomerList.customerList) {
            if (customer.getUsername().equals(ShopSignInService.username) && customer.getPassword().equals(oldPassword)){
                customer.setPassword(newPassword);
                System.out.println("密码修改成功！");
            }
        }
    }
}
