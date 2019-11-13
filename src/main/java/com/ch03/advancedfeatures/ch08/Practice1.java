package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 9:18
 */
public class Practice1 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
    }

    static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 1; i <= 20; i++) {
                System.out.println(i + ".你好，来自线程" +  Thread.currentThread().getName());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
