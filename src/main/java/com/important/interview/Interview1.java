package com.important.interview;

import java.util.Arrays;

/**
 * @author XueYat
 * @date 2019/3/13 11:55
 */
public class Interview1 {
    public static void test14() {
        char a = '男';
        int b = 1;
        double c = a + b;

        System.out.println(a == b);
        System.out.println("char a = " + Integer.valueOf(a));
        System.out.println("" + a + b);
        System.out.println("" + (a + b));
        System.out.println(c);

        char[] word = {'a', 'c', 'b', 'd'};
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));


        char ch = '中';
        System.out.println("char:" + ch);
        int max = Character.MAX_VALUE;
        int min = Character.MIN_VALUE;
        System.out.println(min + "<char<" + max);
    }

}
