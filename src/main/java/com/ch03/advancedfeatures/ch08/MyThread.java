package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/20 20:11
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
