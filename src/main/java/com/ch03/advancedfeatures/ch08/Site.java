package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/22 11:44
 */
public class Site implements Runnable {
    private int count = 10;
    private int num = 0;
    private boolean flag;

    @Override
    public void run() {
        while (true) {
            if(!sale()){
                break;
            }
        }
    }

    /**
     * 售票
     */
    private synchronized boolean sale() {
        if (count <= 0) {
            return false;
        }
        num++;
        count--;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "抢到第" + num + "张票，剩余" + count + "张票！");
        return !"t2".equals(Thread.currentThread().getName());
    }
}
