package com.ch03.advancedfeatures.ch08;

/**
 * @author YatXue
 * @date 2019/6/22 11:44
 */
public class SiteTest {
    public static void main(String[] args) {
        Site site = new Site();
        Thread t1 = new Thread(site, "t1");
        Thread t2 = new Thread(site, "t2");
        Thread t3 = new Thread(site, "t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
