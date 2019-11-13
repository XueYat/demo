package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/22 15:15
 */
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {65, 43, 2, 13, 23, 354, 72};
        int max = arr[0];
        for (int i : arr) {
            if (i > max){
                max = i;
            }
        }
        System.out.println("最大值为：" + max);


        int[] nums = new int[6];
        nums[0] = 25;
        nums[1] = 15;
        nums[2] = 35;
        nums[3] = 65;
        nums[4] = 45;

        System.out.print("排序前：");
        for (int i : nums) {
            if (i != 0){
                System.out.print(i + "\t");
            }
        }
        int temp;
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] < nums[j + 1]){
                    temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        System.out.print("\n排序后：");
        for (int i : nums) {
            if (i != 0){
                System.out.print(i + "\t");
            }
        }

        System.out.print("\n请输入要插入的值：");
        int num = sc.nextInt();
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (num > nums[i]){
                index = i;
                break;
            }
        }

        for (int i = nums.length - 1; i > index; i--) {
            nums[i] = nums[i - 1];
        }
        nums[index] = num;
        System.out.println("插入值的下标为：" + index);
        System.out.print("插入数值后为：");
        for (int i : nums) {
            if (i != 0){
                System.out.print(i + "\t");
            }
        }


    }
}
