package com.ch00.demo.day0726;

public abstract class Handset {
    private String brand;
    private String type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void sendInfo();

    public abstract void call();

    public abstract void info();

}
