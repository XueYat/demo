package com.ch00.demo.demo1.Demo;

public class school {
    static String schoolName;
    static int classNumber;
    static int labNumber;
    public static void showContent(){
        schoolName = "北大青鸟";
        classNumber = 20;
        labNumber = 20;
        System.out.println(schoolName + "培训学员\n" + "配备：" + classNumber + "教" + labNumber + "机");
    }
    public static void main(String[] args){
        showContent();
    }
}
