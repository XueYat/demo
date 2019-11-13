package com.ch00.demo.day0730;

public class Penguin2 {
    private String name;
    private String sex;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Penguin2(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }
}
