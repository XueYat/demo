package com.ch03.advancedfeatures.ch08.threadpool;

import java.util.concurrent.*;

/**
 * @author YatXue
 * @date 2019/6/22 15:18
 */
public class Test {
    public static ThreadFactory threadFactory;
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 7, 300, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(4));
        for (int i = 1; i <= 12; i++) {
            executor.execute(new MyRunnable(i));
            System.out.println("线程数：" + executor.getPoolSize() + "队列中等待数：" + executor.getQueue().size() + "执行完的任务数：" + executor.getCompletedTaskCount());
            /*try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
        executor.shutdown();
    }

    static class MyRunnable implements Runnable{
        int num;

        public MyRunnable(int num) {
            this.num = num;
        }

        @Override
        public void run() {
            System.out.println("正在执行任务" + ":" + num);
            try {
                Thread.sleep(0);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("任务" + num + "执行完毕");
        }
    }
}
