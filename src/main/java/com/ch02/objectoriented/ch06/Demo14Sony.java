package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 13:51
 */
public class Demo14Sony extends Demo14Phone{
    Demo14Sony(String brand, String type){
        super(brand, type);
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    public void sendInfo() {
        System.out.println("发送文字信息...");
    }

    @Override
    public void call() {
        System.out.println("开始语音通话...");
    }

    @Override
    public void play(String content) {
        System.out.println("开始播放" + content);
    }
}
