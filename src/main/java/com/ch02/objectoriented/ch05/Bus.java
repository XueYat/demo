package com.ch02.objectoriented.ch05;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/25 15:51
 */
public class Bus extends AbstractAutomobile{
    private Scanner sc = new Scanner(System.in);
    private int seats, sumPrice;
    static Bus[] buses = new Bus[2];

    static {
        Bus bus1 = new Bus();
        Bus bus2 = new Bus();
        bus1.brand = "金杯";
        bus1.seats = 16;
        bus1.numberPlate = "晋A-00001";
        bus1.rent = 800;
        bus2.brand = "金龙";
        bus2.seats = 34;
        bus2.numberPlate = "晋A-00002";
        bus2.rent = 1500;
        buses[0] = bus1;
        buses[1] = bus2;
    }

    @Override
    void calRent(int days, AbstractAutomobile automobile) {
        sumPrice = days * automobile.rent;
        System.out.println("租金为：" + sumPrice);
    }

    @Override
    String info(AbstractAutomobile automobile) {
        Bus bus = (Bus) automobile;
        return "您租的车的信息为：" + bus.brand + "，座位数：" + bus.seats + "，车牌号：" + bus.numberPlate + "，总租金为：" + sumPrice + "￥";
    }

    @Override
    void leaseOutFlow() {
        while (true) {
            System.out.println("品牌\t|\t座位\t|\t车牌号\t\t|\t日租金");
            for (Bus bus : buses) {
                System.out.println(bus.brand + "\t|\t" + bus.seats + "\t|\t" + bus.numberPlate + "\t|\t" + bus.rent);
            }
            System.out.print("请输入要租的车的编号：");
            String name = sc.next();
            if ("金龙".equals(name) || "金杯".equals(name)) {
                System.out.print("请输入租的天数：");
                int days = sc.nextInt();
                AbstractAutomobile automobile = CarBusiness.motoLeaseOut(name);
                calRent(days, automobile);
                System.out.println(info(automobile));
                break;
            } else {
                System.out.println("请重新输入！");
            }
        }
    }
}
