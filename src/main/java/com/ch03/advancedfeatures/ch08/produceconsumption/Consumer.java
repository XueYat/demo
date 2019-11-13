package com.ch03.advancedfeatures.ch08.produceconsumption;

/**
 * @author YatXue
 * @date 2019/6/22 14:28
 */
public class Consumer implements Runnable {
    private Movie movie = null;

    Consumer(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            movie.get();
        }
    }
}
