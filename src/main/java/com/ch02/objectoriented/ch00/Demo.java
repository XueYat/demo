package com.ch02.objectoriented.ch00;

/**
 * @author YatXue
 * @date 2019/3/14 15:29
 */
public class Demo {
    public static void main(String[] args){
        //传递形式1
        int a = 1;
        int b = 2;
        change(a, b);
        System.out.println(a);
        System.out.println(b);
        //传递形式2
        int[] arr = {1, 2, 3, 4};
        System.out.println(arr[2]);
        change(arr);
        System.out.println(arr[2]);
    }

    private static void change(int a, int b){
        a = a + b;
        b = b + a;
    }

    private static void change(int[] arr){
        arr[2] = 100;
    }

}
