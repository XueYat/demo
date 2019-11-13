package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/24 14:27
 */
public class Priority {
    public static void main(String[] args) {
        Thread thread = new Thread(new My());
        System.out.println("*****显示默认优先级*****");
        System.out.println("主线程名：" + Thread.currentThread().getName() + "，优先级" + Thread.currentThread().getPriority());
        System.out.println("子线程名：" + thread.getName() + "，优先级" + thread.getPriority());

        System.out.println("*****修改默认优先级*****");
        Thread.currentThread().setPriority(10);
        thread.setPriority(1);
        System.out.println("主线程名：" + Thread.currentThread().getName() + "，优先级" + Thread.currentThread().getPriority());
        System.out.println("子线程名：" + thread.getName() + "，优先级" + thread.getPriority());
    }

    static class My implements Runnable{
        @Override
        public void run() {
        }
    }
}
