package com.ch00.demo.day0725;

public class Truck extends MotoVehicle{
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    @Override
    int CalcRent(int days) {
        int money = 0;
        money +=  50 *  getWeight() * days;
        return money;
    }
}
