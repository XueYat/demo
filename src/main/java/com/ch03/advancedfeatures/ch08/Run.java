package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 15:09
 */
public class Run {
    public static void main(String[] args) {
        RunThread rt = new RunThread();
        for (int i = 1; i <= 10; i++) {
            new Thread(rt, "第" + i + "号选手").start();
        }
    }

    static class RunThread implements Runnable{
        int m = 1000;
        @Override
        public synchronized void run() {
            System.out.println(Thread.currentThread().getName() + "拿到了接力棒！");
            for (int i = 0; i < 100; i += 10) {
                System.out.println(Thread.currentThread().getName() + "跑了" + (i + 10) + "米！");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            m -= 100;
            System.out.println("剩余：" + m);
        }
    }
}
