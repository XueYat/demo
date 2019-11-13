package com.ch00.demo.day0730;

import java.util.ArrayList;

public class PenguinTest {
    public static void main(String[] args) {
        Penguin p0 = new Penguin("欧欧", "Q仔");
        Penguin p1 = new Penguin("丫丫", "Q妹");
        Penguin p2 = new Penguin("菲菲", "Q妹");
        Penguin p3 = new Penguin("美美", "Q妹");
        ArrayList<Penguin> list = new ArrayList<>();
        list.add(p0);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        System.out.println("共计有" + list.size() + "只企鹅\n" + "分别是：");
        for (Penguin p : list) {
            System.out.println(p.getName() + "\t\t" + p.getSex());
        }
        System.out.println();

        list.remove(p2);
        list.remove(p3);
        System.out.println("删除之后还有" + list.size() + "只企鹅\n" + "分别是：");
        for (Penguin p : list) {
            System.out.println(p.getName() + "\t\t" + p.getSex());
        }
        System.out.println();

        if(list.contains(p3)){
            System.out.println("包含美美的信息！");
        }else{
            System.out.println("不包含美美的信息！");
        }


    }
}
