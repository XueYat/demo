package com.ch00.demo.day0725;

public class Car extends MotoVehicle {
    private String Type;    //型号

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public Car(String type, String no){
        this.Type = type;
        this.setNo(no);
    }

    int  CalcRent(int days){
        int money = 0;
        if(this.getType().equals("别克商务舱GL8")){
            money +=  600 * days;
        }else if(this.getType().equals("宝马550i")){
            money += 500 * days;
        }else{
            money  += 300 * days;
        }
        return money;
    }
}
