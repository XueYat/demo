package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/21 9:02
 */
public class PenguinTest {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.setHealth(110);
        System.out.println(penguin.getHealth());
    }
}
