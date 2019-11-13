package com.ch00.demo.day0726;
import com.ch00.demo.day0726.impl.*;

public class Computer implements Cpu, Ems, HardDisk{
    String brand, hz, emm, hmm;

    public void cpu(String brand, String hz){
        this.brand = brand;
        this.hz = hz;
    }

    public void ems(String mm){
        this.emm = mm;
    }

    public void HardDisk(String mm){
        this.hmm = mm;
    }

    public void show(){
        System.out.println("计算机的信息如下：");
        System.out.println("CPU的品牌是：" + brand + "，频率是：" + hz);
        System.out.println("硬盘容量是：" + hmm);
        System.out.println("内存容量是：" + emm);
    }
}
