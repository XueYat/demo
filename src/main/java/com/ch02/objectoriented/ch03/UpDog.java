package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/22 11:01
 */
public class UpDog extends UpPet{
    UpDog(String name, int sex, int health, int love){
        this.name = name;
        this.sex = sex;
        setHealth(health);
        this.love = love;
    }

    @Override
    void show() {
        super.show();
        if (getSex() == 1){
            System.out.print("，我是Q仔");
        }else {
            System.out.print("，我是Q妹");
        }
    }
}
