package com.ch00.demo.pet;

public class Penguin {
    static final String SEX_MALE = "Q仔";
    static final String SEX_FEMALE = "Q妹";
    String name, sex;
    int helth = 100, love = 0;

    public static String getSexMale() {
        return SEX_MALE;
    }

    public static String getSexFemale() {
        return SEX_FEMALE;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        if(sex == SEX_MALE){
            this.sex = "雄";
        }else{
            this.sex = "雌";
        }
    }

    public int getHelth() {
        return helth;
    }

    public void setHelth(int helth) {
        if(helth < 0){
            this.helth = 60;
            System.out.println("健康值小于0，默认为60");
        }else{
            this.helth = helth;
        }
    }

    public Penguin(String name){
        this.name = name;
    }

    public void intro(){
        System.out.println("我的名字叫" + name + "，健康值是：" + helth + "，和主人亲密度为：" + love + "，性别是" + sex);
    }
}
