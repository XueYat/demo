package com.ch03.advancedfeatures.ch01;

import java.util.*;

/**
 * @author YatXue
 * @date 2019/3/29 8:20
 */
public class Test {
    public static void main(String[] args) {
        /*CustomerList<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("HAHAHAHA");

        //第一种遍历方法使用foreach遍历List
        for (String str : list) {
            System.out.println(str);
        }
        System.out.println();

        //第二种遍历，把链表变为数组相关的内容进行遍历
        String[] strArray=new String[list.size()];
        list.toArray(strArray);
        for(int i=0;i<strArray.length;i++)
        {
            System.out.println(strArray[i]);
        }
        System.out.println();

        //第三种遍历 使用迭代器进行相关遍历
        Iterator<String> ite=list.iterator();
        //判断下一个元素之后有值
        while(ite.hasNext())
        {
            System.out.println(ite.next());
        }*/

        Set<String> set = new HashSet<String>();
        Set<Integer> set1 = new HashSet<Integer>();
        set.add("Java");
        set.add("Hello");
        set.add("World");
        set.add(null);
        set.add(null);
        set.add(null);
        set.add(new String("java"));

        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println(set.size());
        System.out.println(set);

        /*for (String s : set) {
            System.out.println(s.hashCode());
        }*/

        System.out.println();
        System.out.println(set1.size());
        System.out.println(set1);

        for (Integer integer : set1) {
            System.out.println(integer.hashCode());
        }

        boolean flag = set.add(new String("java"));
        System.out.println(flag);
        System.out.println(set);

        System.out.println("-------------------");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //强转只能针对单个对象
        /*String[] a = (String[]) set.toArray();
        for (String s : a) {
            System.out.println(s);
        }
        
        Object[] b = set.toArray();
        for (Object o : b) {
            String c = (String) o;
            System.out.println(c);
        }*/
    }
}
