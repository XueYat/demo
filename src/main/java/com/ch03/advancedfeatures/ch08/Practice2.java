package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 9:28
 */
public class Practice2 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread t1 = new Thread(myThread, "m1");
        Thread t2 = new Thread(myThread, "m2");
        t1.start();
        t2.start();
    }

    static class MyThread implements Runnable{

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
