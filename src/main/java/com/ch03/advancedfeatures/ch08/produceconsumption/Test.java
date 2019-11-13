package com.ch03.advancedfeatures.ch08.produceconsumption;

/**
 * @author YatXue
 * @date 2019/6/22 14:28
 */
public class Test {
    public static void main(String[] args) {
        Movie movie = new Movie();
        Thread pro = new Thread(new Producer(movie));
        Thread con = new Thread(new Consumer(movie));
        pro.start();
        con.start();
    }
}
