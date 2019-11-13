package com.ch03.advancedfeatures.ch03;

/**
 * @author YatXue
 * @date 2019/4/3 14:24
 */
public class Study {
    void show(StudyEnum studyEnum){
        switch (studyEnum){
            case L1:
                System.out.println("大数据开发工程师");
                break;
            case L2:
                System.out.println("大数据挖掘工程师");
                break;
            case L3:
                System.out.println("大数据架构师");
                break;
            default:
        }
    }
    public static void main(String[] args) {
        /*StudyEnum[] stage = StudyEnum.values();
        for (StudyEnum studyEnum : stage) {
            switch (studyEnum){
                case L1:
                    System.out.println("大数据开发工程师");
                    break;
                case L2:
                    System.out.println("大数据挖掘工程师");
                    break;
                case L3:
                    System.out.println("大数据架构师");
                    break;
                default:
            }
        }*//*
        Study study = new Study();
        study.show(StudyEnum.L1);
        study.show(StudyEnum.L2);
        study.show(StudyEnum.L3);*/

        /*int num = 10;
        double aa = 11.23;
        String aaa = Double.toString(aa);
        String a = Integer.toString(num);
        String b = String.valueOf(num);
        System.out.println(aaa);
        System.out.println(a);
        System.out.println(b);
        int c = Integer.parseInt(a);
        int d = Integer.valueOf(b);
        System.out.println(c);
        System.out.println(d);*/

        int count = 0;
        for (int i = 0; i < 200; i++) {
            int shu = (int) ((Math.random() * 9 + 1) * 1000);
            System.out.println(shu);
            count++;
        }
        System.out.println(count);
    }
}