package com.ch00.demo.day0724;

public class Bus extends MotoVehicle{
    private int SeatCount;   //座位数

    public int getSeatCount() {
        return SeatCount;
    }

    public void setSeatCount(int seatCount) {
        SeatCount = seatCount;
    }

    public final void bus(String no, int seatCount){
        System.out.print("您的车牌为：" + getNo() + "，车型是："  + getBrand() + "，座位数是：" + getSeatCount());
    }

    void CalcRent(int days){
        if(getSeatCount() == 16){
            System.out.print("租金是："  + 800 * days);
        }else{
            System.out.print("租金是："  + 1500 * days);
        }
    }
}
