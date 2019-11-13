package com.ch02.objectoriented.ch01.demo30;

/**
 * @author YatXue
 * @date 2019/3/13 20:37
 */
public class Demo30Customer {
    String[] cardType = {"金卡", "银卡", "普卡"};
    int integral;
    String type;

    void show(){
        System.out.println("积分：" + integral + "\t" + "卡类型：" + type);
        feedback();
    }

    void feedback(){
        if (integral >= 1000 && cardType[0].equals(type)  || integral >= 5000 && cardType[2].equals(type)){
            System.out.println("回馈积分500分！");
        }
    }
}
