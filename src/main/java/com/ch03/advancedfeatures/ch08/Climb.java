package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 14:21
 */
public class Climb {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread young = new Thread(myRunnable, "年轻人");
        Thread old = new Thread(myRunnable, "老年人");
        System.out.println("**********开始爬山**********");
        young.start();
        young.setPriority(10);
        old.start();
    }

    static class MyRunnable implements Runnable{


        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "爬完100米！");
            }
            System.out.println(Thread.currentThread().getName() + "爬到终点！");
        }
    }
}
