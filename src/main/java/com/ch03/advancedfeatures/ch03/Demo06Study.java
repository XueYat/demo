package com.ch03.advancedfeatures.ch03;

/**
 * @author YatXue
 * @date 2019/4/3 8:01
 */
public class Demo06Study {
    public static void main(String[] args) {
        for (Demo06StudyEnum value : Demo06StudyEnum.values()) {
            Demo06StudyEnum studyEnum = value;
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
    }
}
