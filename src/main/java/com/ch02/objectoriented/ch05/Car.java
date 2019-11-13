package com.ch02.objectoriented.ch05;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/25 15:51
 */
public class Car extends AbstractAutomobile{
    private Scanner sc = new Scanner(System.in);
    private String model;
    private int sumPrice;
    static Car[] cars = new Car[2];

    static {
        Car car1 = new Car();
        Car car2 = new Car();
        car1.brand = "别克";
        car1.model = "林荫大道";
        car1.numberPlate = "晋A-00001";
        car1.rent = 300;
        car2.brand = "宝马";
        car2.model = "550i";
        car2.numberPlate = "晋A-00002";
        car2.rent = 500;
        cars[0] = car1;
        cars[1] = car2;
    }

    @Override
    void calRent(int days, AbstractAutomobile automobile) {
        sumPrice = days * automobile.rent;
        System.out.println("租金为：" + sumPrice);
    }

    @Override
    String info(AbstractAutomobile automobile) {
        Car car = (Car) automobile;
        return "您租的车的信息为：" + car.brand + car.model + "，车牌号：" + car.numberPlate + "，总租金为：" + sumPrice + "￥";
    }

    @Override
    void leaseOutFlow() {
        while (true) {
            System.out.println("品牌\t|\t车型\t\t|\t车牌号\t\t|\t日租金");
            for (Car car : cars) {
                System.out.println(car.brand + "\t|\t" + car.model + "\t|\t" + car.numberPlate + "\t|\t" + car.rent);
            }
            System.out.print("请输入要租的车：");
            String name = sc.next();
            if ("别克".equals(name) || "宝马".equals(name)) {
                System.out.print("请输入租的天数：");
                int days = sc.nextInt();
                calRent(days, CarBusiness.motoLeaseOut(name));
                System.out.println(info(CarBusiness.motoLeaseOut(name)));
                break;
            } else {
                System.out.println("请重新输入！");
            }
        }
    }
}
