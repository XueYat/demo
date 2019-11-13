package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 9:01
 */
class Ordering {
    private static Scanner sc = new Scanner(System.in);
    void iWantToOrderAMeal(){
        String name, address;
        int chooseDish, number, time;
        System.out.println("**************我要订餐**************");
        System.out.print("请输入订餐人姓名：");
        name = sc.next();
        Main.dishesShow.show();
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.print("请选择您要点的菜品编号:");
        chooseDish = sc.nextInt();
        System.out.print("请选择您需要的份数:");
        number = sc.nextInt();
        while (true){
            System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐)：");
            time = sc.nextInt();
            if(time <= 20 && time >= 10){
                break;
            }else{
                System.out.println("请按提示输入！");
            }
        }
        System.out.print("请输入送餐地址：");
        address = sc.next();

        // 菜品样式和份数
        String dishMeg =  Main.foodInfo.dishNames[chooseDish - 1] +" "+ number + "份";
        // 计算订单金额
        double sumPrice = Main.foodInfo.dishPrice[chooseDish - 1] * number;
        // 计算送餐费
        double deliCharge = (sumPrice >= 50) ? 0 : 5;

        for(int i = 0; i < Main.foodInfo.names.length; i++){
            if(Main.foodInfo.names[i] == null){
                Main.foodInfo.names[i] = name;
                Main.foodInfo.dishMegs[i] = dishMeg;
                Main.foodInfo.times[i] = time;
                Main.foodInfo.addresses[i] = address;
                Main.foodInfo.states[i] = 0;
                Main.foodInfo.sumPrices[i] = (sumPrice + deliCharge);
                System.out.println("订餐成功！");
                System.out.println("您订的是：" + dishMeg);
                System.out.println("送餐时间：" + time);
                System.out.println("送餐地址：" + address);
                System.out.println("餐费：" + sumPrice + "元，送餐费" + deliCharge + "元，总计：" + (sumPrice + deliCharge) + "元。");
                break;
            }
        }
        System.out.print("请确认订单信息，输入任意键返回！");
        sc.next();
    }
}
