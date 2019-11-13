package com.ch01.firstknowjava.exam;

/**
 * @author YatXue
 * @date 2019/3/14 9:44
 */
class FoodInfo {
    String[] dishNames = new String[3];
    double[] dishPrice = new double[3];
    int[] dishLikes = new int[3];
    /**
     * 保存订餐人名称
     * */
    String[] names = new String[10];
    /**
     * 保存菜品名及份数
     * */
    String[] dishMegs = new String[10];
    /**
     * 保存送餐时间
     * */
    int[] times = new int[10];
    /**
     * 保存送餐地址
     * */
    String[] addresses = new String[10];
    /**
     * 保存订单状态： 0：已预订 1：已完成
     * */
    int[] states = new int[10];
    /**
     * 保存订单的总金额
     * */
    double[] sumPrices = new double[10];

    /**
     * 初始化订单信息
     * */
    void info(){
        dishNames[0] = "红烧带鱼";
        dishNames[1] = "鱼香肉丝";
        dishNames[2] = "时令蔬菜";
        dishPrice[0] = 38.0;
        dishPrice[1] = 20.0;
        dishPrice[2] = 10.0;

        names[0] = "张晴";
        dishMegs[0] = dishNames[0] + " " + "2份";
        times[0] = 12;
        addresses[0] = "成天路207号";
        states[0] = 1;
        sumPrices[0] = 76;
        names[1] = "张晴";
        dishMegs[1] = dishNames[1] + " " + "2份";
        times[1] = 18;
        addresses[1] = "成天路207号";
        states[1] = 0;
        sumPrices[1] = 45;
    }

    public String[] getDishNames() {
        return dishNames;
    }

    public void setDishNames(String[] dishNames) {
        this.dishNames = dishNames;
    }

    public double[] getDishPrice() {
        return dishPrice;
    }

    public void setDishPrice(double[] dishPrice) {
        this.dishPrice = dishPrice;
    }

    public int[] getDishLikes() {
        return dishLikes;
    }

    public void setDishLikes(int[] dishLikes) {
        this.dishLikes = dishLikes;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public String[] getDishMegs() {
        return dishMegs;
    }

    public void setDishMegs(String[] dishMegs) {
        this.dishMegs = dishMegs;
    }

    public int[] getTimes() {
        return times;
    }

    public void setTimes(int[] times) {
        this.times = times;
    }

    public String[] getAddresses() {
        return addresses;
    }

    public void setAddresses(String[] addresses) {
        this.addresses = addresses;
    }

    public int[] getStates() {
        return states;
    }

    public void setStates(int[] states) {
        this.states = states;
    }

    public double[] getSumPrices() {
        return sumPrices;
    }

    public void setSumPrices(double[] sumPrices) {
        this.sumPrices = sumPrices;
    }
}
