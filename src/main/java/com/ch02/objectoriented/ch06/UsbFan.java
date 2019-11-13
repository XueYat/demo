package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/27 9:38
 */
public class UsbFan implements UsbInterface{
    @Override
    public void service() {
        System.out.println("usb开始供电，风扇转动...");
    }
}
