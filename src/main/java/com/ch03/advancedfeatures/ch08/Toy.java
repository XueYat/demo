package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/22 13:49
 */
public class Toy {
    public static void main(String[] args) {
        Object bobby = new Object();
        Object duck = new Object();
        Thread tang = new Thread(new TangTang(bobby, duck));
        Thread dou = new Thread(new DouDou(bobby, duck));
        tang.start();
        dou.start();
    }

    static class TangTang implements Runnable{
        Object bobby;
        Object duck;

        public TangTang(Object bobby, Object duck) {
            super();
            this.bobby = bobby;
            this.duck = duck;
        }

        @Override
        public void run() {
            synchronized(bobby){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (duck){

                }
                System.out.println("糖糖把芭比给豆豆玩");
            }
        }
    }

    static class DouDou implements Runnable{
        Object bobby;
        Object duck;

        public DouDou(Object bobby, Object duck) {
            super();
            this.bobby = bobby;
            this.duck = duck;
        }

        @Override
        public void run() {
            synchronized(duck){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (bobby){

                }
                System.out.println("豆豆把玩具鸭给糖糖玩");
            }
        }
    }
}
