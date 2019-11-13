package com.ch00.demo.day0724;

import java.util.Scanner;

public class MotoVehicleTest {
    public static void main(String[] args) {
        Car car = new Car();
        Bus bus = new Bus();
        Scanner sc = new Scanner(System.in);
        int num, day;

        for(;;) {
            System.out.println("*****青鸟汽车租赁公司*****");
            System.out.println("\t\t1.轿车");
            System.out.println("\t\t2.客车");
            System.out.print("请输入您要租赁的车辆类型：");
            num = sc.nextInt();System.out.print("请输入您要租赁的天数：");
            day = sc.nextInt();
            if (num == 1) {
                System.out.println("\t1.别克商务舱GL8 ----- 600");
                System.out.println("\t2.宝马550i ----- 500");
                System.out.println("\t3.别克林荫大道 ----- 300");
                System.out.println("\t4.返回");
                System.out.print("请输入您要租赁的车辆：");
                num = sc.nextInt();
                if(num == 1){
                    car.setType("别克商务舱GL8");
                    car.setNo("晋A-00001");
                    car.setBrand("别克");
                    car.setColor("白色");
                    car.setMileage(1234);
                    car.Car("晋A-00001", "别克商务舱GL8");
                    car.CalcRent(day);
                }else if(num == 2){
                    car.setType("宝马550i");
                    car.setNo("晋A-00002");
                    car.setBrand("宝马");
                    car.setColor("白色");
                    car.setMileage(1234);
                    car.Car("晋A-00002", "宝马550i");
                    car.CalcRent(day);
                }else if(num == 3){
                    car.setType("别克林荫大道");
                    car.setNo("晋A-00003");
                    car.setBrand("别克");
                    car.setColor("白色");
                    car.setMileage(1234);
                    car.Car("晋A-00003", "别克林荫大道");
                    car.CalcRent(day);
                }else if(num == 4){
                    break;
                }else{
                    System.out.println("请按提示输入！");
                }
            } else if (num == 2) {
                System.out.println("\t1.金杯 ----- 800");
                System.out.println("\t2.金龙 ----- 1500");
                System.out.println("\t3.返回");
                System.out.print("请输入您要租赁的车辆：");
                num = sc.nextInt();
                if(num == 1){
                    bus.setSeatCount(16);
                    bus.setNo("晋A-00001");
                    bus.setBrand("金杯");
                    bus.setColor("白色");
                    bus.setMileage(1234);
                    bus.CalcRent(day);
                }else if(num == 2){
                    bus.setSeatCount(25);
                    bus.setNo("晋A-00002");
                    bus.setBrand("金龙");
                    bus.setColor("白色");
                    bus.setMileage(1234);
                    bus.CalcRent(day);
                }else if(num == 3){
                    break;
                }else{
                    System.out.println("请按提示输入！");
                }
            } else if (num == 0) {
                break;
            } else {
                System.out.println("请按提示输入！");
            }
        }
    }
}
