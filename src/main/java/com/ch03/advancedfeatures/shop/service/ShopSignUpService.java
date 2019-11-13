package com.ch03.advancedfeatures.shop.service;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.model.Customer;

/**
 * @author YatXue
 * @date 2019/4/5 18:08
 */
public class ShopSignUpService {
    public static boolean isExist(String cardId){
        boolean flag = true;
        for (Customer customer : CustomerList.customerList) {
            if (customer.getCardId().equals(cardId)){
                System.out.println("您已经注册过了！");
                flag = false;
            }
        }
        return flag;
    }

    public static void signUpIsFlag(String name, String cardId, String username, String password, double integral){
        Customer customer = new Customer(name, cardId, username, password, integral);
        CustomerList.customerList.add(customer);
        System.out.println("注册成功！");
    }
}
