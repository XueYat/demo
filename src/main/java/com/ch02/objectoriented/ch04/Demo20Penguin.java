package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 14:38
 */
public class Demo20Penguin extends Demo20Pet{

    void info(String name, int health){
        setName(name);
        setHealth(health);
    }

    @Override
    void show() {
        super.show();
    }

    @Override
    void eat() {
        super.eat();
        int health = getHealth();
        if (health < 100 && health + 5 <= 100){
            setHealth(health += 5);
            System.out.print(getName() + "吃了小鱼，健康值加5，目前健康值为：" + health);
        }else if (health + 5 > 100 && health + 5 < 105){
            int blood = 100 - health;
            setHealth(100);
            System.out.print(getName() + "吃了小鱼，健康值加" + health + "，目前健康值为：" + getHealth());
        }else{
            System.out.print(getName() + "现在不用进食！");
        }
    }
}
