package com.ch03.advancedfeatures.test;

/**
 * @author YatXue
 * @date 2019/4/25 11:24
 */
public class Subject {
    private int id;
    private String name;
    private int hour;

    public Subject(int id, String name, int hour) {
        this.id = id;
        this.name = name;
        this.hour = hour;
    }

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

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }
}
