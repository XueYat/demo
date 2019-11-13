package com.ch00.demo.day0730;

import java.util.*;

public class PenguinMapTest {
    public static void main(String[] args) {
        Penguin p0 = new Penguin("欧欧", "Q仔");
        Penguin p1 = new Penguin("丫丫", "Q妹");
        Penguin p2 = new Penguin("菲菲", "Q妹");
        Penguin p3 = new Penguin("美美", "Q妹");
        HashMap<String, Penguin> penguin = new HashMap<>();
        penguin.put("欧欧", p0);
        penguin.put("丫丫", p1);
        penguin.put("菲菲", p2);
        penguin.put("美美", p3);
        System.out.println("共计有" + penguin.size() + "只企鹅\n" + "分别是：");

        Set<String> keys = penguin.keySet();
        Iterator<String> it = keys.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Penguin p = penguin.get(key);
            System.out.println(key + "\t\t" + p.getSex());
        }
        System.out.println("===============");

        for (String key : keys) {
            Penguin p = penguin.get(key);
            System.out.println(p.getName() + "\t\t" + p.getSex());
        }
    }
}
