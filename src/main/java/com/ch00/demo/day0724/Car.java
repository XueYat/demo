package com.ch00.demo.day0724;

public class Car extends MotoVehicle{
    private String Type;    //型号

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public void Car(String no, String type){
        System.out.print("您的车牌为：" + getNo() + "，车型是："  + getBrand() + "，型号是：" + getType());
    }

    void CalcRent(int days){
        if(this.getType().equals("别克商务舱GL8")){
            System.out.println("租金是："  + 600 * days);
        }else if(this.getType().equals("宝马550i")){
            System.out.println("租金是："  + 500 * days);
        }else{
            System.out.println("租金是："  + 300 * days);
        }
    }
}
