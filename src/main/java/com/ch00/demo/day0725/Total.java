package com.ch00.demo.day0725;

public class Total {

    public int calcTotalRent(MotoVehicle[] motos, int days){
        int totalRent = 0;
        for(int i = 0; i < motos.length; ++i){
            totalRent += motos[i].CalcRent(days);
        }
        return totalRent;
    }
}
