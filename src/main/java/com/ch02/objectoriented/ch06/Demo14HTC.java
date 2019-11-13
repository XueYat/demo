package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 13:51
 */
public class Demo14HTC extends Demo14Phone{
    Demo14HTC(String brand, String type){
        super(brand, type);
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    public void sendInfo() {
        System.out.println("发送带图片与文字的信息...");
    }

    @Override
    public void call() {
        System.out.println("开始视频通话...");
    }

    @Override
    public void play(String content) {
        System.out.println("开始播放" + content);
    }

    @Override
    public void photograph() {
        System.out.println("咔嚓，拍照成功...");
    }

    @Override
    public void internetAccess() {
        System.out.println("已经开启移动网络...");
    }
}
