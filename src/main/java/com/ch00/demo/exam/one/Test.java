package com.ch00.demo.exam.one;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuessMachine q = new QuessMachine();
        System.out.print("请猜测“" + q.initail() + "”的价格：");
        q.p = sc.nextInt();
        for(int i = 0; i < 4; i++){
            if(q.p == q.price){
                System.out.println(q.quess());
                break;
            }else if(q.p > q.price){
                System.out.println(q.quess());
                System.out.println("再猜一次吧：");
                q.p = sc.nextInt();
            }else{
                System.out.println(q.quess());
                System.out.println("再猜一次吧：");
                q.p = sc.nextInt();
            }
            if(i == 3){
                System.out.println("4次内没有猜对，再接再厉！");
            }
        }
    }
}

