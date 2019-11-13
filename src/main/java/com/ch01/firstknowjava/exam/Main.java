package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 9:01
 */
public class Main {
    static FoodInfo foodInfo = new FoodInfo();
    private static Scanner sc = new Scanner(System.in);
    static DishesShow dishesShow = new DishesShow();
    private static Ordering ordering = new Ordering();
    static Show show = new Show();
    private static Signing signing = new Signing();
    private static Delete delete = new Delete();
    private static Like like = new Like();

    public void show() {
        foodInfo.info();
        while (true){
            int num;
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
            try {
                num = Integer.parseInt(sc.nextLine().trim());
                switch (num) {
                    case 1:
                        ordering.iWantToOrderAMeal();
                        break;
                    case 2:
                        show.viewMealBag();
                        break;
                    case 3:
                        signing.signingOrder();
                        break;
                    case 4:
                        delete.deleteOrder();
                        break;
                    case 5:
                        like.iLikeIt();
                        break;
                    case 6:
                        System.out.println("系统退出！");
                        System.exit(1);
                        break;
                    default:
                        System.out.println("请输入正确的数！");
                }
            }catch (Exception e){
                System.out.println("请输入正确的数！");
            }
        }
    }
}
