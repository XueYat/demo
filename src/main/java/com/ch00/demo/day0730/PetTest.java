package com.ch00.demo.day0730;

import java.util.HashMap;
import java.util.Map;

public class PetTest {
    public static void main(String[] args) {
        Pet p0 = new Pet("欧欧", "雪纳瑞");
        Pet p1 = new Pet("菲菲", "拉布拉多");
        Map<Integer, Pet> map = new HashMap<>();
        map.put(0, p0);
        map.put(1, p1);
        //map.remove(0);
        if(map.containsKey(0)){
            System.out.println("Map中包含指定对象，信息如下：");
            Pet p = map.get(0);
            System.out.println(p.getName() + "\t\t" + p.getType());
        }else{
            System.out.println("不包含！");
        }
    }
}
