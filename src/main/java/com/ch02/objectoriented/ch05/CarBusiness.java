package com.ch02.objectoriented.ch05;

/**
 * @author YatXue
 * @date 2019/3/25 16:26
 */
class CarBusiness {
    static AbstractAutomobile motoLeaseOut(String motoType){
        if (Car.cars[0].brand.equals(motoType)){
            return Car.cars[0];
        }else if (Car.cars[1].brand.equals(motoType)){
            return Car.cars[1];
        }else if (Bus.buses[0].brand.equals(motoType)){
            return Bus.buses[0];
        }else {
            return Bus.buses[1];
        }
    }
}
