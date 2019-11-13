package com.ch03.advancedfeatures.ch02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/4/2 19:11
 */
public class Worker {
    String enName;
    String name;
    String sex;

    Worker(){}

    Worker(String enName, String name, String sex){
        this.enName = enName;
        this.name = name;
        this.sex = sex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Worker worker1 = new Worker("Jack", "杰克马", "男");
        Worker worker2 = new Worker("Pony", "马化腾", "男");
        Worker worker3 = new Worker("Robin", "李彦宏", "男");

        Map<String, Worker> map = new HashMap<String, Worker>();
        map.put(worker1.enName, worker1);
        map.put(worker2.enName, worker2);
        map.put(worker3.enName, worker3);

        System.out.print("请输入英文名:");
        String en = sc.next();
        for (String s : map.keySet()) {
            Worker worker = map.get(s);
            if (worker.enName.equals(en)){
                System.out.println(worker.enName + "***" + worker.name + "***" + worker.sex);
            }
        }
    }
}
