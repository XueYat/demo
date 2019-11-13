package com.ch00.demo.practice;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Animal[] list = new Animal[3];

        Cat cat = new Cat("加菲猫", 4);
        Duck duck = new Duck("唐老鸭", 2);
        Dolphin dolphin = new Dolphin("海欧欧", 0);
        list[0] = cat;
        list[1] = duck;
        list[2] = dolphin;


            for(;;) {
                try {
                    System.out.println("动物名\t\t" + "腿数\t\t" + "叫声");
                    System.out.println("--------------------------");
                    for (int i = 0; i < list.length; i++) {
                        if (list[i] instanceof Cat) {
                            System.out.print(list[i].getName() + "\t\t");
                            System.out.print(cat.getLegNum() + "\t\t");
                            list[i].shout();
                        } else if (list[i] instanceof Duck) {
                            System.out.print(list[i].getName() + "\t\t");
                            System.out.print(duck.getLegNum() + "\t\t");
                            list[i].shout();
                        } else if (list[i] instanceof Dolphin) {
                            System.out.print(list[i].getName() + "\t\t");
                            System.out.print(dolphin.getLegNum() + "\t\t");
                            list[i].shout();
                        } else {
                            break;
                        }
                    }

                    System.out.print("是否要继续修改数据，按0进行修改操作，其他任意数字退出：");
                    int num = sc.nextInt();
                    if (num == 0) {
                        boolean flag = false;
                        System.out.print("请输入要修改的动物名称：");
                        String name = sc.next();
                        for (int i = 0; i < list.length; i++) {
                            if (list[i].getName().equals(name)) {
                                flag = true;
                                if (list[i] instanceof Cat) {
                                    System.out.print("请输入猫的名称：");
                                    name = sc.next();
                                    System.out.print("请输入猫的腿数：");
                                    int legs = sc.nextInt();
                                    if(legs == 4){
                                        cat = new Cat(name, legs);
                                        list[i] = cat;
                                    }else{
                                        throw new Exception("猫只能有4条腿！");
                                    }
                                } else if (list[i] instanceof Duck) {
                                    System.out.print("请输入鸭子的名称：");
                                    name = sc.next();
                                    System.out.print("请输入鸭子的腿数：");
                                    int legs = sc.nextInt();
                                    if(legs == 2){
                                        duck = new Duck(name, legs);
                                        list[i] = duck;
                                    }else{
                                        throw new Exception("鸭子只能有2条腿！");
                                    }
                                } else {
                                    System.out.print("请输入海豚的名称：");
                                    name = sc.next();
                                    System.out.print("请输入海豚的腿数：");
                                    int legs = sc.nextInt();
                                    if(legs == 0){
                                        dolphin = new Dolphin(name, legs);
                                        list[i] = dolphin;
                                    }else{
                                        throw new Exception("海豚没有腿！");
                                    }
                                }
                            } else {
                                flag = false;
                            }
                        }
                        if (flag == false) {
                            System.out.println("该名字不存在！");
                        }
                    } else {
                        System.out.println("程序结束！");
                        break;
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
    }
}
