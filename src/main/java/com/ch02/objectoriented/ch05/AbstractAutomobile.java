package com.ch02.objectoriented.ch05;

/**
 * @author YatXue
 * @date 2019/3/25 15:52
 */
abstract class AbstractAutomobile {
    String brand;
    String numberPlate;
    int rent;

    /**
     * 显示用户租赁车辆的详细信息
     * @param automobile 汽车对象
     * @return 返回租赁汽车信息
     */
    abstract String info(AbstractAutomobile automobile);

    /**
     * 通过接收实参天数和一个实体对象来判断用户租赁的车的总价
     * @param days 租赁天数
     * @param automobile 传入一个汽车对象
     */
    abstract void calRent(int days, AbstractAutomobile automobile);

    /**
     * 显示汽车详细信息，用户进行操作
     */
    abstract void leaseOutFlow();
}
