package com.ch00.demo.exam.three;

public abstract class Animal {
    private String name;
    private String type;
    private String eat;
    private String dothing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getEat() {
        return eat;
    }

    public void setEat(String eat) {
        this.eat = eat;
    }

    public String getDothing() {
        return dothing;
    }

    public void setDothing(String dothing) {
        this.dothing = dothing;
    }

    public Animal(String name, String type, String eat, String dothing){
        this.name = name;
        this.type = type;
        this.eat = eat;
        this.dothing = dothing;
    }

    public abstract void info();
}
