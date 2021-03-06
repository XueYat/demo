package com.ch00.demo.day0726;
import com.ch00.demo.day0726.impl.*;

public class AptitudeHandset extends Handset implements PlayWiring, Network, TheakePictures{
    public AptitudeHandset(String brand, String type){
        this.setBrand(brand);
        this.setType(type);
    }

    @Override
    public void call() {
        System.out.print("打电话、");
    }

    @Override
    public void sendInfo() {
        System.out.print("发短信、");
    }

    @Override
    public void play() {
        System.out.print("播放、");
    }

    @Override
    public void networkConn() {
        System.out.print("上网、");
    }

    @Override
    public void takePictures() {
        System.out.print("拍照");
    }

    @Override
    public void info() {
        System.out.print(getBrand() + getType() + "可以：");
        call();
        sendInfo();
        play();
        networkConn();
        takePictures();
    }
}
