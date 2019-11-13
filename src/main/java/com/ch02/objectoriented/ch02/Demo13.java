package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/14 19:04
 */
public class Demo13 {
    String brand;
    void powerStorage(){
        System.out.print(brand + "电池可以蓄电");
    }

    public static void main(String[] args) {
        Demo13 demo13 = new Demo13();
        demo13.brand = "南孚";
        demo13.powerStorage();
    }
}
