package com.ch00.demo.day0730;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class PenguinMapTest2 {
    public static void main(String[] args) {
        Penguin2 p0 = new Penguin2(0, "欧欧", "Q仔");
        Penguin2 p1 = new Penguin2(1, "丫丫", "Q妹");
        Penguin2 p2 = new Penguin2(2, "菲菲", "Q妹");
        Penguin2 p3 = new Penguin2(3, "美美", "Q妹");
        HashMap<Integer, Penguin2> penguin2 = new HashMap<>();
        penguin2.put(0, p0);
        penguin2.put(1, p1);
        penguin2.put(2, p2);
        penguin2.put(3, p3);
        System.out.println("共计有" + penguin2.size() + "只企鹅\n" + "分别是：");

        Set<Integer> keys = penguin2.keySet();
        Iterator<Integer> it = keys.iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            Penguin2 p = penguin2.get(key);
            System.out.println(key + "\t\t" + p.getName() + "\t\t" + p.getSex());
        }
        System.out.println("==================");

        for (Integer key : keys) {
            Penguin2 p = penguin2.get(key);
            System.out.println(p.getId() + "\t\t" + p.getName() + "\t\t" + p.getSex());
        }
    }
}
