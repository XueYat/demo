package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/26 15:27
 */
public class Demo19Test {
    public static void main(String[] args) {
        Demo19Computer computer = new Demo19Computer();
        System.out.println("计算机的信息如下：");
        System.out.println(computer.cpu("英特尔", "3.5GHz"));
        System.out.println(computer.ems("英睿达", "16GB"));
        System.out.println(computer.hd("1TB"));
    }
}
