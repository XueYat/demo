package com.ch00.demo.exam.four;

public class Test {
    public static void main(String[] args) {
        try {
            int[] num = new int[5];
            num[0] = 0;
            num[1] = 1;
            num[2] = 2;
            num[3] = 3;
            num[4] = 4;
            num[5] = 5;
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组下标越界！");
            e.printStackTrace();
        }
    }
}
