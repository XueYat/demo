package com.ch03.advancedfeatures.ch08.produceconsumption;

/**
 * @author YatXue
 * @date 2019/6/22 14:28
 */
public class Movie {
    private String name;
    private String info;
    private boolean flag = true;

    Movie() {
    }

    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public synchronized void get(){
        if (flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.getName() + "--" + this.getInfo());
        flag = true;
        super.notify();
    }

    public synchronized void set(String name, String info){
        if (!flag){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.name = name;
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.info = info;
        flag = false;
        super.notify();
    }
}
