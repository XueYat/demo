package com.ch00.demo.day0726;

public class HandsetTest {
    public static void main(String[] args) {
        CommonHandset ch = new CommonHandset("普通手机", "诺基亚");
        AptitudeHandset ah = new AptitudeHandset("智能手机", "小米");
        ch.info();
        System.out.println();
        ah.info();
    }
}
