package com.ch00.demo.day0724;

public class AnimalTest {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Fish fish = new Fish();

        bird.setColor("红色");
        bird.info(4);



        fish.setWeight(5);
        fish.info(2);
    }
}
