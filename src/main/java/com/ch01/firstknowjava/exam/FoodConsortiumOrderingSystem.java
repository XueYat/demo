package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 */
public class FoodConsortiumOrderingSystem {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        String name, address;
        int chooseDish, number, time, ordnum, ordnums = 0;

        String[] dishNames = new String[3];
        double[] dishPrice = new double[3];
        int[] dishLikes = new int[3];

        dishNames[0] = "红烧带鱼";
        dishNames[1] = "鱼香肉丝";
        dishNames[2] = "时令蔬菜";
        dishPrice[0] = 38.0;
        dishPrice[1] = 20.0;
        dishPrice[2] = 10.0;
        dishLikes[0] = 0;
        dishLikes[1] = 0;
        dishLikes[2] = 0;
        // 保存订餐人名称
        String[] names = new String[10];
        // 保存菜品名及份数
        String[] dishMegs = new String[10];
        // 保存送餐时间
        int[] times = new int[10];
        // 保存送餐地址
        String[] addresses = new String[10];
        // 保存订单状态： 0：已预订 1：已完成
        int[] states = new int[10];
        // 保存订单的总金额
        double[] sumPrices = new double[10];

        names[0] = "张晴";
        dishMegs[0] = dishNames[0] + " " + "2份";
        times[0] = 12;
        addresses[0] = "成天路207号";
        states[0] = 1;
        sumPrices[0] = 76;
        names[1] = "张晴";
        dishMegs[1] = dishNames[1] + " " + "2份";
        times[1] = 18;
        addresses[1] = "成天路207号";
        states[1] = 0;
        sumPrices[1] = 45;

        try{
            for(;;){
                System.out.println("\t\t欢迎使用吃货联盟订餐系统");
                System.out.println("************************************");
                System.out.println("\t\t\t1.我要订餐");
                System.out.println("\t\t\t2.查看餐袋");
                System.out.println("\t\t\t3.签收订单");
                System.out.println("\t\t\t4.删除订单");
                System.out.println("\t\t\t5.我要点赞");
                System.out.println("\t\t\t6.退出系统");
                System.out.println("************************************");
                System.out.print("请选择：");
                num = sc.nextInt();

                switch (num){
                    case 1:
                        System.out.println("**************我要订餐**************");
                        System.out.print("请输入订餐人姓名：");
                        name = sc.next();
                        System.out.println("* * * * * * * * * * * * * * * * * *");
                        System.out.println("序号\t\t菜名\t\t\t单价\t\t点赞数");
                        for(int i = 0; i < dishNames.length; i++){
                            System.out.println((i + 1) + "\t\t" + dishNames[i] + "\t\t" + dishPrice[i] + "\t" + dishLikes[i]);
                        }
                        System.out.println("* * * * * * * * * * * * * * * * * *");
                        System.out.print("请选择您要点的菜品编号:");
                        chooseDish = sc.nextInt();
                        System.out.print("请选择您需要的份数:");
                        number = sc.nextInt();
                        for(;;){
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

                        String dishMeg =  dishNames[chooseDish - 1] +" "+ number + "份";
                        //计算订单金额
                        double sumPrice = dishPrice[chooseDish - 1] * number;
                        // 计算送餐费
                        double deliCharge = (sumPrice >= 50) ? 0 : 5;

                        for(int i = 0; i < names.length; i++){
                            if(names[i] == null){
                                names[i] = name;
                                dishMegs[i] = dishMeg;
                                times[i] = time;
                                addresses[i] = address;
                                states[i] = 0;
                                sumPrices[i] = (sumPrice + deliCharge);
                                System.out.println("订餐成功！");
                                System.out.println("您订的是：" + dishMeg);
                                System.out.println("送餐时间：" + time);
                                System.out.println("餐费：" + sumPrice + "元，送餐费"
                                        + deliCharge + "元，总计：" + (sumPrice + deliCharge) + "元。");
                                break;
                            }
                        }
                        System.out.print("请确认订单信息，输入任意键返回！");
                        sc.next();
                        break;
                    case 2:
                        System.out.println("**************查看餐袋**************");
                        System.out.println("序号\t\t订餐人\t\t餐品信息\t\t\t送餐时间\t\t送餐地址\t\t\t总金额\t\t订单状态");
                        for(int i = 0; i < names.length; i++){
                            if(names[i] != null){
                                System.out.println((i + 1) + "\t\t" + names[i] + "\t\t\t" + dishMegs[i] + "\t\t" + times[i]
                                        + "\t\t\t" + addresses[i] + "\t\t" + sumPrices[i] + "\t\t" + states[i]);
                            }
                        }
                        System.out.print("输入任意键返回！");
                        sc.next();
                        break;
                    case 3:
                        System.out.println("**************签收订单**************");
                        System.out.println("序号\t\t订餐人\t\t餐品信息\t\t\t送餐时间\t\t送餐地址\t\t\t总金额\t\t订单状态");
                        for(int i = 0; i < names.length; i++){
                            if(names[i] != null){
                                System.out.println((i + 1) + "\t\t" + names[i] + "\t\t\t" + dishMegs[i] + "\t\t" + times[i]
                                        + "\t\t\t" + addresses[i] + "\t\t" + sumPrices[i] + "\t\t" + states[i]);
                            }
                        }
                        System.out.print("请选择要签收的订单序号：");
                        ordnum = sc.nextInt();
                        for(int i = 0; i < names.length; i++){
                            if(names[i] != null){
                                ordnums = i + 1;
                            }else{
                                break;
                            }
                        }
                        for(int i = 0; i < names.length; i++){
                            if (names[i] != null) {
                                if(ordnum == i + 1) {
                                    if (states[i] == 0) {
                                        states[i] = 1;
                                        System.out.println("订单签收成功！");
                                        break;
                                    }else{
                                        System.out.println("该订单已签收！");
                                        break;
                                    }
                                }
                                if(ordnum > ordnums){
                                    System.out.println("不存在该订单信息！");
                                    break;
                                }
                            }
                        }
                        System.out.print("输入任意键返回！");
                        sc.next();
                        break;
                    case 4:
                        System.out.println("**************删除订单**************");
                        System.out.println("序号\t\t订餐人\t\t餐品信息\t\t\t送餐时间\t\t送餐地址\t\t\t总金额\t\t订单状态");
                        for(int i = 0; i < names.length; i++){
                            if(names[i] != null){
                                System.out.println((i + 1) + "\t\t" + names[i] + "\t\t\t" + dishMegs[i] + "\t\t" + times[i]
                                        + "\t\t\t" + addresses[i] + "\t\t" + sumPrices[i] + "\t\t" + states[i]);
                            }
                        }
                        System.out.print("请输入要删除的订单序号：");
                        ordnum = sc.nextInt();
                        for(int i = 0; i < names.length; i++){
                            if(names[i] != null){
                                ordnums = i + 1;
                            }else{
                                break;
                            }
                        }
                        for(int i = 0; i < names.length - 1; i++){
                            if(ordnum == i + 1){
                                if(states[i] == 1){
                                    for(int j = ordnum; j <= names.length - 1; j++){
                                        names[j - 1] = names[j];
                                        dishMegs[j - 1] = dishMegs[j];
                                        times[j - 1] = times[j];
                                        addresses[j - 1] = addresses[j];
                                        sumPrices[j - 1] = sumPrices[j];
                                        states[j - 1] = states[j];
                                    }

                                    System.out.println("删除成功");
                                }else{
                                    System.out.println("您选择的订单未签收，不能删除！");
                                }
                            }
                            if(ordnum > ordnums){
                                System.out.println("不存在该订单信息！");
                                break;
                            }
                        }
                        System.out.print("输入任意键返回！");
                        sc.next();
                        break;
                    case 5:
                        System.out.println("**************我要点赞**************");
                        System.out.println("* * * * * * * * * * * * * * * * * *");
                        System.out.println("序号\t\t菜名\t\t\t单价\t\t点赞数");
                        for(int i = 0; i < dishNames.length; i++){
                            System.out.println((i + 1) + "\t\t" + dishNames[i] + "\t\t" + dishPrice[i] + "\t" + dishLikes[i]);
                        }
                        System.out.println("* * * * * * * * * * * * * * * * * *");
                        System.out.println("请选择您要点赞的菜品编号：");
                        num = sc.nextInt();
                        for(int i = 0; i < dishNames.length; i++){
                            if(dishNames[i] != null){
                                ordnums = i + 1;
                            }else{
                                break;
                            }
                        }
                        for(int i = 0; i < dishNames.length; i++){
                            if(num == (i + 1)){
                                dishLikes[num - 1] += 1;
                                System.out.println("点赞成功！");
                            }
                            if(num > ordnums){
                                System.out.println("不存在该菜品编号信息！");
                                break;
                            }
                        }
                        System.out.print("输入任意键返回！");
                        sc.next();
                        break;
                    case 6:
                        System.out.println("退出系统！");
                        break;
                    default:
                }
                if(num == 6){
                    break;
                }
            }
        }catch (Exception e){
            System.out.println("输入异常，程序终止！");
        }
    }
}