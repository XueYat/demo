package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/19 20:30
 */
public class Car {
    /**
     * 座位数
     */
    private int site = 4;
    Car(){
        System.out.println ("载客量是"+site+"人");
    }
    public void setSite(int site){
        this.site = site;
    }
    void print(){
        System.out.print("载客量是"+site+"人");
    }

}
