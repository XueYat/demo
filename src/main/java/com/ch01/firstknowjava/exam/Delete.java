package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 9:07
 */
class Delete {
    private static Scanner sc = new Scanner(System.in);
    void deleteOrder(){
        int num, nums;
        System.out.println("**************删除订单**************");
        Main.show.viewMealBag();
        System.out.print("请输入要删除的订单序号：");
        num = sc.nextInt();
        nums = Main.dishesShow.order();
        for(int i = 0; i < Main.foodInfo.names.length - 1; i++){
            if(num == i + 1){
                if(Main.foodInfo.states[i] == 1){
                    for(int j = num; j <= Main.foodInfo.names.length - 1; j++){
                        Main.foodInfo.names[j - 1] = Main.foodInfo.names[j];
                        Main.foodInfo.dishMegs[j - 1] = Main.foodInfo.dishMegs[j];
                        Main.foodInfo.times[j - 1] = Main.foodInfo.times[j];
                        Main.foodInfo.addresses[j - 1] = Main.foodInfo.addresses[j];
                        Main.foodInfo.sumPrices[j - 1] = Main.foodInfo.sumPrices[j];
                        Main.foodInfo.states[j - 1] = Main.foodInfo.states[j];
                    }

                    System.out.println("删除成功");
                }else{
                    System.out.println("您选择的订单未签收，不能删除！");
                }
            }
            if(num > nums){
                System.out.println("不存在该订单信息！");
                break;
            }
        }
        System.out.print("输入任意键返回！");
        sc.next();
    }
}
