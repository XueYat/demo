package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 15:21
 */
public class Demo19Computer implements Demo19Cpu, Demo19Ems, Demo19HardDisk{
    @Override
    public String cpu(String brand, String frequency) {
        return "CPU的品牌是：" + brand + "，主频是：" + frequency;
    }

    @Override
    public String ems(String type, String capacity) {
        return "内存类型是：" + type + "容量是:" + capacity;
    }

    @Override
    public String hd(String capacity) {
        return "容量是:" + capacity;
    }
}
