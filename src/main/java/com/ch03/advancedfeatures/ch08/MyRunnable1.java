package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/20 20:33
 */
public class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        System.out.println("线程正在运行...");
        try {
            Thread.sleep(500);
            System.out.println("线程处于阻塞状态...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println("线程处于新建状态...");
        MyRunnable1 myRunnable1 = new MyRunnable1();
        Thread thread = new Thread(myRunnable1, "t");
        Thread thread1 = new Thread(myRunnable1, "t1");
        Thread thread2 = new Thread(myRunnable1, "t2");
        thread.start();
        thread1.start();
        thread2.start();
        System.out.println("线程处于就绪状态...");
    }
}
