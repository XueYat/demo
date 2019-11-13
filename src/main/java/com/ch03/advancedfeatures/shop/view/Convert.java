package com.ch03.advancedfeatures.shop.view;

import com.ch03.advancedfeatures.shop.db.CustomerList;
import com.ch03.advancedfeatures.shop.model.Customer;
import com.ch03.advancedfeatures.shop.service.ShopSignInService;
import com.ch03.advancedfeatures.shop.tools.Input;

/**
 * @author YatXue
 * @date 2019/4/6 12:12
 */
class Convert {
    static void convert(){
        for (Customer customer : CustomerList.customerList) {
            if (customer.getUsername().equals(ShopSignInService.username)) {
                System.out.println("卡号为：" + customer.getUsername() + "的总积分为：" + customer.getIntegral());
                if (customer.getIntegral() < 1000){
                    System.out.println("您的积分少于1000，暂不能兑换礼品！");
                }else {
                    String answer = "y";
                    while ("y".equals(answer)){
                        if (customer.getIntegral() >= 1000) {
                            System.out.println(">>>>>积分兑换<<<<<");
                            System.out.println("编号\t\t商品\t\t积分");
                            System.out.println("1\t\tJava\t3000");
                            System.out.println("2\t\tSQL\t\t2000");
                            System.out.println("3\t\tC#\t\t1000");
                            System.out.print("请选择您要兑换的商品编号：");
                            int num = Input.sc.nextInt();
                            if (num == 1) {
                                if (customer.getIntegral() >= 3000) {
                                    customer.setIntegral(customer.getIntegral() - 3000);
                                    System.out.println("兑换成功！总积分为：" + customer.getIntegral());
                                } else {
                                    System.out.println("您的积分暂时不够兑换此礼品！");
                                    continue;
                                }
                            } else if (num == 2) {
                                if (customer.getIntegral() >= 2000) {
                                    customer.setIntegral(customer.getIntegral() - 2000);
                                    System.out.println("兑换成功！总积分为：" + customer.getIntegral());
                                } else {
                                    System.out.println("您的积分暂时不够兑换此礼品！");
                                    continue;
                                }
                            } else if (num == 3) {
                                if (customer.getIntegral() >= 1000) {
                                    customer.setIntegral(customer.getIntegral() - 1000);
                                    System.out.println("兑换成功！总积分为：" + customer.getIntegral());
                                }
                            } else {
                                System.out.println("请按提示输入！");
                                continue;
                            }
                            System.out.print("是否继续？(y/n)");
                            answer = Input.sc.next();
                        }else {
                            System.out.println("您的积分少于1000，暂不能兑换礼品！");
                            break;
                        }
                    }
                }
            }
        }
    }
}
