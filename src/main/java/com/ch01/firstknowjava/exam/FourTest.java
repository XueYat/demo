package com.ch01.firstknowjava.exam;

/**
 * @author YatXue
 * @date 2019/3/22 15:17
 */
public class FourTest {
    public static void main(String[] args) {
        Four[] stu = new Four[3];

        Four stu1 = new Four();
        stu1.name = "张三";
        stu1.age = 20;
        stu1.sex = "男";

        Four stu2 = new Four();
        stu2.name = "李四";
        stu2.age = 21;
        stu2.sex = "女";

        Four stu3 = new Four();
        stu3.name = "王五";
        stu3.age = 22;
        stu3.sex = "男";

        stu[0] = stu1;
        stu[1] = stu2;
        stu[2] = stu3;

        /*for (int i = 0; i < stu.length; i++) {
            System.out.println("姓名：" + stu[i].name + "，年龄：" + stu[i].age + "，性别：" + stu[i].sex);
        }*/

        for (Four four : stu) {
            System.out.println("姓名：" + four.name + "，年龄：" + four.age + "，性别：" + four.sex);
        }

    }
}
