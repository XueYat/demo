package com.ch00.demo.day0726.impl;

import com.ch00.demo.day0726.Computer;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.cpu("Inter", "3.5GHz");
        c.ems("8G");
        c.HardDisk("2TB");
        c.show();
    }
}
