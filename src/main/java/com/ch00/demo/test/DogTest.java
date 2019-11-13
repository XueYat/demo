package com.ch00.demo.test;
import com.ch00.demo.pet.Dog;

public class DogTest {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setHelth(70);
        dog.setName("狗");
        dog.setLove(50);
        dog.setVarieties("哈士奇");
        dog.intro();
    }
}
