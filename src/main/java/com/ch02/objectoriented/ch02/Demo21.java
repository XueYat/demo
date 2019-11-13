package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/14 19:19
 */
public class Demo21 {
    void downloadMusic(){
        System.out.print("下载音乐");
    }
    void playMusic(){
        System.out.print("播放音乐");
    }

    public static void main(String[] args) {
        Demo13 demo13 = new Demo13();
        Demo21 demo21 = new Demo21();
        System.out.print("手机可以");
        demo21.downloadMusic();
        demo21.playMusic();
        demo13.brand = "手机";
        demo13.powerStorage();
    }
}
