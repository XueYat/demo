package com.ch00.demo.day0725;

public abstract class MotoVehicle {
    private String No;      //车牌
    private String Brand;   //品牌
    private String Color;   //颜色
    private double Mileage; //里程

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getMileage() {
        return Mileage;
    }

    public void setMileage(double mileage) {
        Mileage = mileage;
    }

    abstract int CalcRent(int days);

}
