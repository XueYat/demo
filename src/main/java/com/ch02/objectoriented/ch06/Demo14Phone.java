package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 13:40
 */
public class Demo14Phone implements Demo14{
    String brand;
    String type;

    Demo14Phone(String brand, String type){
        this.brand = brand;
        this.type = type;
    }

    void sendInfo(){
        System.out.println("发送短信");
    }

    void call(){
        System.out.println("打电话");
    }

    void info(){
        System.out.println("这是一款型号为" + this.type + "的" + this.brand + "手机");
    }

    @Override
    public void play(String content) {
        System.out.println("播放");
    }

    @Override
    public void photograph() {
        System.out.println("拍照");
    }

    @Override
    public void internetAccess() {
        System.out.println("上网");
    }
}
