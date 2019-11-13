package com.ch00.demo.day0731;

public class JavaTest {
    public Java java;
    public void test(Java java){
        switch (java){
            case U1:
                System.out.println("第一单元打基础");
                break;
            case U2:
                System.out.println("第二单元胜任Java程序开发");
                break;
            case U3:
                System.out.println("第三单元胜任企业级Java开发");
                break;
        }
    }

    public static void main(String[] args) {
        JavaTest jt = new JavaTest();
        jt.test(Java.U1);
        jt.test(Java.U2);
        jt.test(Java.U3);
    }
}
