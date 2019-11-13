package com.ch02.objectoriented.ch05;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/25 16:27
 */
public class CarRental {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("*****青鸟汽车租赁公司*****");
            System.out.println("\t\t1.轿车");
            System.out.println("\t\t2.客车");
            System.out.print("请输入您要租赁的车辆类型：");
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    AbstractAutomobile automobile = new Car();
                    automobile.leaseOutFlow();
                    break;
                case 2:
                    AbstractAutomobile automobile1 = new Bus();
                    automobile1.leaseOutFlow();
                    break;
                default:
                    System.out.println("请按提示输入！");
                    continue;
            }
            break;
        }
    }
}
