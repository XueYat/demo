package com.ch00.demo.exam.one;

public class QuessMachine {
    int num = (int)(Math.random() * 3);
    String name;
    int price, p;
    String ans;

    public String initail(){
        if(num == 0){
            name = "电视机";
            price = 1000;
        }else if(num == 1){
            name = "电瓶车";
            price = 2000;
        }else{
            name = "洗衣机";
            price = 3000;
        }
        return name;
    }

    public String quess(){
        if(p == price){
            return "猜对了";
        }else if(p > price){
            return "猜小点";
        }else{
            return "猜大点";
        }
    }
}
