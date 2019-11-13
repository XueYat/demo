package com.ch03.advancedfeatures.ch05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/4/5 14:39
 */
public class Now {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy");
        String now = format.format(date);
        String now1 = format1.format(date);
        System.out.println(now);
        System.out.println(date);
        System.out.println(now1);
        String a = "1";
        /*System.out.print("请输入你的生日：");
        int year = scanner.nextInt();
        System.out.println("你的年龄是：" + (Integer.parseInt(now1) - year));
        System.out.print("请输入你的身份证号：");
        String sfzh = scanner.next();
        String id = sfzh.substring(6, 10);
        System.out.println("你的年龄是：" + (Integer.parseInt(now1) - Integer.parseInt(id)));*/

        /*Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.YEAR) + "年" + (c.get(Calendar.MONTH) + 1) + "月" + c.get(Calendar.DAY_OF_MONTH));
        System.out.println("周" + (c.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("这月中的第" + c.get(Calendar.DAY_OF_WEEK_IN_MONTH) + "周");
        System.out.println("这年中的第" + c.get(Calendar.DAY_OF_YEAR) + "天");
        System.out.println("这年中的第" + c.get(Calendar.WEEK_OF_YEAR) + "周");
        System.out.println("这月中的第" + c.get(Calendar.WEEK_OF_MONTH) + "周");
        System.out.println("这天中的第" + c.get(Calendar.HOUR_OF_DAY) + "时");*/
    }
}