package com.ch02.objectoriented.ch01;

/**
 * @author YatXue
 * @date 2019/3/13 17:52
 */
public class Demo20 {
    private String schoolName;
    private int schoolClassroomNum, schoolEngineroomNum;
    public void display(){
        System.out.println(schoolName + "培训学员\n" + "配备：" + schoolClassroomNum + "教室" + schoolEngineroomNum + "机房");
    }

    public static void main(String[] args) {
        Demo20 demo20 = new Demo20();
        demo20.schoolName = "太原中心";
        demo20.schoolClassroomNum = 10;
        demo20.schoolEngineroomNum = 10;
        demo20.display();
    }

}
