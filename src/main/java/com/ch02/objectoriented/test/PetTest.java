package com.ch02.objectoriented.test;

import com.ch00.demo.Test2;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/13 16:05
 */
public class PetTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pet cat = new Cat();
        System.out.print("请输入物种：");
        String type = sc.next();
        System.out.print("请输入叫声：");
        String barking = sc.next();
        System.out.print("请输入腿数：");
        int legs = sc.nextInt();
        System.out.print("请输入颜色：");
        String color = sc.next();
        System.out.print("请输入名字：");
        String name = sc.next();
        ((Cat)cat).info(type, barking, legs, color);
        cat.show();
        PetTest pt = new PetTest();
        pt.petTest(cat);
        cat.name(name);
    }

    private void petTest(Pet pet){
        pet.eat();
    }
}
