package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 14:37
 */
public class Hospital {
    public static void main(String[] args) {
        Texu texu = new Texu();
        Thread t = new Thread(texu, "特需号");
        t.start();
        t.setPriority(10);
        for (int i = 1; i <= 50; i++) {
            System.out.println("普通号：" + i + "号病人在看病！");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 10){
                try {
                    t.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Texu implements Runnable{
        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(Thread.currentThread().getName() + "：" + i + "号病人在看病！");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
