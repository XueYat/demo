package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/27 9:37
 */
public class UsbTest {
    public static void main(String[] args) {
        UsbDisk disk = new UsbDisk();
        disk.service();
        UsbFan fan = new UsbFan();
        fan.service();
    }
}
