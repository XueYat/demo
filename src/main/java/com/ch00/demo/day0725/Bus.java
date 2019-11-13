package com.ch00.demo.day0725;

public class Bus extends MotoVehicle {
    private int SeatCount;   //座位数

    public int getSeatCount() {
        return SeatCount;
    }

    public void setSeatCount(int seatCount) {
        SeatCount = seatCount;
    }

    public Bus(String brand, int seatCount){
        this.setBrand(brand);
        this.SeatCount = seatCount;
    }

    int CalcRent(int days){
        int money = 0;
        if(getSeatCount() == 16){
            money +=  800 * days;
        }else{
            money +=  1500 * days;
        }
        return money;
    }
}
