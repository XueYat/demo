package com.ch00.demo.day0726test;

public class StudyTest {
    public static void main(String[] args) {
        Sporter sp = new SporterPingPong("马龙");
        Sporter sb = new SportBasketball("姚明");
        Teach tp = new TeachPingPong("刘国梁");
        Teach tb = new TeachBasketball("乔丹");
        sp.print();
        sb.print();
        tp.print();
        tb.print();
    }
}
