package com.ch01.firstknowjava.exam;

/**
 * @author YatXue
 * @date 2019/3/22 15:14
 */
public class Two {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "×" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 9; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "×" + j + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
