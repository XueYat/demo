package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/21 9:02
 */
public class Penguin {
    private int health;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health >= 1 && health <= 100){
            this.health = health;
        }else {
            this.health = 1;
        }
    }
}
