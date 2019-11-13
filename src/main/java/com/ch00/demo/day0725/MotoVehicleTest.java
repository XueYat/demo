package com.ch00.demo.day0725;

public class MotoVehicleTest {
    public static void main(String[] args) {
        MotoVehicle[] motos = new MotoVehicle[5];
        motos[0] = new Car("宝马550i", "京NY28588");
        motos[1] = new Car("宝马550i", "京NNN328");
        motos[2] = new Car("别克商务舱GL8", "京NY28588");
        motos[3] = new Bus("金龙", 34);
        motos[4] = new Truck(50);

        Total t = new Total();
        System.out.println(t.calcTotalRent(motos, 10));
    }
}
