package com.ch03.advancedfeatures.test;

import java.util.*;

/**
 * @author YatXue
 * @date 2019/4/25 11:24
 */
public class SubjectTest {
    public static void main(String[] args) {
        Map<Integer, Subject> map = new HashMap<>();
        Subject sb1 = new Subject(1, "Java基础", 10);
        Subject sb2 = new Subject(2, "面向对象", 10);
        Subject sb3 = new Subject(3, "高级特性", 10);
        map.put(sb1.getId(), sb1);
        map.put(sb2.getId(), sb2);
        map.put(sb3.getId(), sb3);

        /*for (Integer integer : map.keySet()) {
            Subject subject = map.get(integer);
            System.out.println(subject.getId() + "\t" + subject.getName() + "\t\t" + subject.getHour());
        }

        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Subject subject = map.get(iterator.next());
            System.out.println(subject.getId() + "\t" + subject.getName() + "\t\t" + subject.getHour());
        }*/

        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        for (Object o : list) {
            System.out.println(o);
        }

        List list1 = new ArrayList();

    }
}
