package com.ch03.advancedfeatures.ch04;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/4/4 9:42
 */
public class Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("请输入一个字符串：");
        String str = sc.next();
        System.out.print("请输入要查找的字：");
        String st = sc.next();
        int sum = 0;
        int i = 0;
        while(true) {
            int a = str.indexOf(st, i);
            if(a == -1) {
                //找不到，跳出来
                break;
            }else {
                System.out.println(a);
                //找到，计数
                sum++;
                //更新查找索引值，继续找
                i = str.indexOf(st, i) + 1;
            }
        }
        System.out.println("“" + str + "”中包含" + sum + "个" + "“" + st + "”！");*/


        String gs = "长亭外 古道边 芳草碧连天 晚风拂柳笛声残 夕阳山外山";
        int i1;
        for (int i = 0; i < gs.length(); i++) {
            i1 = gs.indexOf(" ", i);
            if (i1 != -1){
                System.out.println(gs.substring(i, i1));
                i = i1;
            }else{
                System.out.println(gs.substring(i));
                break;
            }
        }
        String[] gc = gs.split(" ");
        for (String s : gc) {
            System.out.println(s);
        }
    }
}