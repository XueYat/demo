package com.ch02.objectoriented.test;

import java.util.LinkedList;

/**
 * @author YatXue
 * @date 2019/3/29 11:13
 */
public class Test {
    int a;

    public static void main(String[] args) {
        LinkedList<Test> list = new LinkedList<Test>();

        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        Test t4 = new Test();

        t1.a = 1;
        t2.a = 2;
        t3.a = 3;
        t4.a = 4;

        list.add(t1);
        list.add(t2);
        list.add(t3);


        for (Test test : list) {
            System.out.println(test.a);
        }
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "：" + list.get(i).a);
        }


        System.out.println();
        list.add(1, t4);

        System.out.println();
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + "：" + list.get(i).a);
        }

    }
}
