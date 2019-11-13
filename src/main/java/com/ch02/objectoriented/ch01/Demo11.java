package com.ch02.objectoriented.ch01;

import java.math.BigDecimal;

/**
 * @author YatXue
 * @date 2019/3/13 17:26
 */
public class Demo11 {
    String carBrand = "法拉利";
    String carModel = "F360 Spider";
    String carColor = "黄色";
    int price = 3800000;
    public void start(){
        System.out.println("发动...");
    }
    public void accelerate(){
        System.out.println("加速...");
    }
    public void stop(){
        System.out.println("停止...");
    }

    String dogColor = "白色";
    public void bark(){
        System.out.println("叫...");
    }
    public void run(){
        System.out.println("跑...");
    }
    public void eat(){
        System.out.println("吃...");
    }


    void a(){
        String b = "b";
        System.out.println(b);
    }
    void b(){
        String a = "a";
    }



    public class aa{
        String c;
    }

    public static void main(String[] args) {
        Demo11 demo11 = new Demo11();
        demo11.a();

    }

}

