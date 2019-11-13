package com.ch02.objectoriented.ch03;

import java.util.List;

/**
 * @author YatXue
 * @date 2019/3/19 20:30
 */
public class Bus extends Car{
    Bus(int site){
        setSite(site);
    }

    public static void main(String[] args) {
        Bus bus = new Bus(20);
        bus.print();
    }
}
