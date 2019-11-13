package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/27 9:36
 */
public class UsbDisk implements UsbInterface{
    @Override
    public void service() {
        System.out.println("u盘开始传输数据...");
    }
}
