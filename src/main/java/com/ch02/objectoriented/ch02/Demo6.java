package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/14 16:25
 */
public class Demo6 {
    String color = "黄色";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void run(){
        System.out.println("正以0.1米/秒的速度向前奔跑");
    }
    void cry(){
        String sound = "吼叫";
    }
    String robBall(){
        String ball = "球";
        return ball;
    }

    String showInfo(){
        return "这是一个" + getColor() + "的狮子";
    }

    public static void main(String[] args) {
        Demo6 demo6 = new Demo6();
        System.out.println(demo6.showInfo());
        System.out.println("抢到一个" + demo6.robBall());
    }
}
