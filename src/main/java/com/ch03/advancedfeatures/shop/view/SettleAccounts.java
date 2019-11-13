package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.model.Customer;
import com.ch03.advancedfeatures.shop.service.ShopSignInService;
import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/6 12:11
 */
class SettleAccounts {
    static void settleAccounts(){
        System.out.println(">>>>>购物结算<<<<<");
        String answer = "y";
        double price = 0, prices, cha;
        while ("y".equals(answer)) {
            System.out.println("编号\t\t商品\t\t单价");
            System.out.println("1\t\tJava\t80.00");
            System.out.println("2\t\tSQL\t\t70.00");
            System.out.println("3\t\tC#\t\t60.00");
            System.out.print("请输入商品编号：");
            int id = Input.sc.nextInt();
            System.out.print("请输入购买数量：");
            int num = Input.sc.nextInt();
            if (id == 1){
                price += 80 * num;
            }else if (id == 2){
                price += 70 * num;
            }else if (id == 3){
                price += 60 * num;
            }else {
                System.out.println("请按提示输入！");
                continue;
            }
            System.out.print("是否继续？(y/n)");
            answer = Input.sc.next();
        }
        do {
            System.out.println("应付款：" + price);
            System.out.print("实付款：");
            prices = Input.sc.nextDouble();
            if (prices >= price){
                System.out.println("找零：" + (prices - price) + "￥");
                for (Customer customer : CustomerList.customerList) {
                    if (customer.getUsername().equals(ShopSignInService.username)){
                        customer.setIntegral(price);
                        System.out.println("本次消费为卡上积了" + price +  "分，卡号为：" + customer.getUsername() + "的总积分为：" + customer.getIntegral());
                    }
                }
            }else {
                System.out.println("您支付的钱不够！");
            }
        }while (prices < price);
    }
}
