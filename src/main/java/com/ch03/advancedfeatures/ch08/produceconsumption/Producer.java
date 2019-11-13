package com.ch03.advancedfeatures.ch08.produceconsumption;

/**
 * @author YatXue
 * @date 2019/6/22 14:27
 */
public class Producer implements Runnable {
    private Movie movie = null;
    Producer(Movie movie) {
        super();
        this.movie = movie;
    }

    boolean flag = true;

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (flag){
                movie.set("变形金刚", "科幻片");
                flag = false;
            }else {
                movie.set("神偷奶爸", "动画片");
                flag = true;
            }
        }
    }
}
