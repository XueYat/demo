package interview;


import org.junit.Test;

import java.math.BigInteger;

/**
 * @author YatXue
 * @date 2019/9/1 14:44
 */

public class DemoTest1 {
    @Test
    public void test() {
        System.out.println(Math.floor(1.9));
    }

    @Test
    public void stockTest() {
        int[] nums = {4, 5, 6, 9, 26, 39, 1, 18, 24, 21, 19, 23};
        int min = nums[0];
        int maxProfit = 0;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num - min > maxProfit) {
                maxProfit = num - min;
            }
        }
        System.out.println(maxProfit);
    }

    /**
     * 九九乘法表
     *
     * @author YatXue
     * @date 2019/9/19 9:04
     */
    @Test
    public void multiplicationTable() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                if (j <= i) {
                    System.out.print(i + "*" + j + "=" + i * j + "\t");
                }
            }
            System.out.println();
        }
    }

    /**
     * 冒泡排序最优法，时间复杂度为O(n)；没有isSwap判断时时间复杂度为O(n^2)
     *
     * @author YatXue
     * @date 2019/9/19 9:02
     */
    @Test
    public void bubbleSort() {
        long l = System.currentTimeMillis();
        int[] nums = new int[50000];
        for (int i = 0; i < 50000; i++) {
            int num = (int) (Math.random() * 10000);
            nums[i] = num;
        }
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            //当次循环是否发生元素交换
            boolean isSwap = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    isSwap = true;
                }
            }
            //如果当次循环没有发生元素交换，则数组已经排好序
            if (!isSwap) {
                for (int num : nums) {
                    System.out.print(num + "\t");
                }
                long l1 = System.currentTimeMillis();
                System.out.println("\n" + l);
                System.out.println(l1);
                System.out.println(l1 - l);
                return;
            }
        }
    }

    @Test
    public void test1() {
        int[] nums = {1, 5, 3, 4, 9};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
        }
    }

    @Test
    public void hashMap() {
        int i = 1;
        ++i;
        System.out.println(i + 1);
        i++;
        System.out.println(i);
    }

    @Test
    public void addTest() {
        System.out.println(add(5, 7));
    }

    /**
     * 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
     *
     * @param num1 num1
     * @param num2 num2
     * @return int
     */
    public int add(int num1, int num2) {
        BigInteger n1 = new BigInteger(String.valueOf(num1));
        BigInteger n2 = new BigInteger(String.valueOf(num2));
        return n1.add(n2).intValue();
    }

    @Test
    public void studentTest() {
    }

    public void tt() {
        //language=JSON
        String json = "{\"a\": 1, \"b\": 2}";
    }
}