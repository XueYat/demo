package com.ch00.demo.exam.three;

public class Test {
    public static void main(String[] args) {
        Animal c = new Chick("喔喔", "小鸡", "虫子", "打鸣");
        Animal d = new Duck("嘎嘎", "小鸭", "小鱼虾", "游泳");
        c.info();
        d.info();
    }
}
