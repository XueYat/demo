package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 14:38
 */
class Demo20Pet {
    private String name;
    private int health;

    void show(){
        System.out.println(this.name + "的健康值" + this.health);
    }

    void eat(){
        System.out.println("感谢主人，");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
