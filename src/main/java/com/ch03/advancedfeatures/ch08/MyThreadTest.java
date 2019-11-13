package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/20 20:12
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.run();
        myThread1.start();
    }
}
