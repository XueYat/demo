package com.ch00.demo.interview;

public class Interview {
    public static void main(String[] args) {
        String str = "";
        for (;;){
            if (str != null && !str.equals("")){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
            break;
        }
    }
}
