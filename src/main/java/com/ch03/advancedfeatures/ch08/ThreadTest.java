package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/20 20:02
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
        thread.setName("XueYat");
        System.out.println(thread.getName());
    }
}
