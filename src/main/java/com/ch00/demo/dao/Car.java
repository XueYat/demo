package com.ch00.demo.dao;

class Car {
    private int site = 4;  //座位数
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
