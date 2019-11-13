package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/20 20:21
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "first");
        Thread thread1 = new Thread(new MyRunnable(), "second");
        thread.setPriority(Thread.MIN_PRIORITY);
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        thread1.start();
    }
}
