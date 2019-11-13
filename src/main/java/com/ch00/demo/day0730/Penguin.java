package com.ch00.demo.day0730;

public class Penguin {
    private String name;
    private String sex;

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

    public Penguin(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }
}
