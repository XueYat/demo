package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 16:00
 */
public class Demo24Master {
    void adoption(Demo24Pet demo24Pet){
        demo24Pet.recognition();
    }

    void play(Demo24Pet demo24Pet){
        if (demo24Pet instanceof Demo24Dog){
            Demo24Dog demo24Dog = (Demo24Dog) demo24Pet;
            demo24Dog.frisbee();
        }else if (demo24Pet instanceof Demo24Penguin){
            Demo24Penguin demo24Penguin = (Demo24Penguin) demo24Pet;
            demo24Penguin.swim();
        }
    }
}
