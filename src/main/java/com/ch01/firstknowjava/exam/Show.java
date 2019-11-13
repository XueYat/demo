package com.ch01.firstknowjava.exam;

/**
 * @author YatXue
 * @date 2019/3/14 9:07
 */
class Show {
    void viewMealBag(){
        System.out.println("**************查看餐袋**************");
        System.out.println("序号\t\t订餐人\t\t餐品信息\t\t\t送餐时间\t\t送餐地址\t\t\t总金额\t\t订单状态");
        for(int i = 0; i < Main.foodInfo.names.length; i++){
            if(Main.foodInfo.names[i] != null){
                System.out.println((i + 1) + "\t\t" + Main.foodInfo.names[i] + "\t\t\t" + Main.foodInfo.dishMegs[i] + "\t\t" + Main.foodInfo.times[i]
                        + "\t\t\t" + Main.foodInfo.addresses[i] + "\t\t" + Main.foodInfo.sumPrices[i] + "\t\t" + Main.foodInfo.states[i]);
            }
        }
        System.out.println();
        /*System.out.print("输入任意键返回！");
        sc.next();*/
    }
}
