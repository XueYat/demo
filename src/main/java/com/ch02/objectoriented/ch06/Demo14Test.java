package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 14:01
 */
public class Demo14Test {
    public static void main(String[] args) {
        Demo14Sony sony = new Demo14Sony("索尼", "G502c");
        Demo14HTC htc = new Demo14HTC("HTC", "I9100");
        sony.info();
        sony.call();
        sony.sendInfo();
        sony.play("音乐《热雪》...");
        htc.info();
        htc.photograph();
        htc.sendInfo();
        htc.internetAccess();
        htc.play("视频《复仇者联盟4》...");
    }
}
