package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 9:07
 */
class Signing {
    private static Scanner sc = new Scanner(System.in);
    void signingOrder(){
        int num, nums;
        System.out.println("**************签收订单**************");
        Main.show.viewMealBag();
        System.out.print("请选择要签收的订单序号：");
        num = sc.nextInt();
        nums = Main.dishesShow.order();
        for(int i = 0; i < Main.foodInfo.names.length; i++){
            if (Main.foodInfo.names[i] != null) {
                if(num == i + 1) {
                    if (Main.foodInfo.states[i] == 0) {
                        Main.foodInfo.states[i] = 1;
                        System.out.println("订单签收成功！");
                        break;
                    }else{
                        System.out.println("该订单已签收！");
                        break;
                    }
                }
                if(num > nums){
                    System.out.println("不存在该订单信息！");
                    break;
                }
            }
        }
        System.out.print("输入任意键返回！");
        sc.next();
    }
}
