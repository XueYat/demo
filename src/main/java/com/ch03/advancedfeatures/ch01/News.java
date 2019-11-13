package com.ch03.advancedfeatures.ch01;

import java.util.*;

/**
 * @author YatXue
 * @date 2019/3/29 10:09
 */
public class News {
    private int id;
    private String title;

    private String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void main(String[] args) {
        LinkedList<News> news = new LinkedList<News>();
        News news1 = new News();
        News news2 = new News();
        News news3 = new News();
        News news4 = new News();
        News news5 = new News();
        News news6 = new News();
        News news7 = new News();
        News news8 = new News();
        News news9 = new News();
        News news10 = new News();

        news1.id = 1;
        news2.id = 2;
        news3.id = 3;
        news4.id = 4;
        news5.id = 5;
        news6.id = 6;
        news7.id = 7;
        news8.id = 8;
        news9.id = 9;
        news10.id = 10;
        news1.title = "今日头条";
        news2.title = "今日2条";
        news3.title = "今日3条";
        news4.title = "今日4条";
        news5.title = "今日5条";
        news6.title = "今日6条";
        news7.title = "今日7条";
        news8.title = "今日8条";
        news9.title = "今日9条";
        news10.title = "今日10条";

        news.add(news1);
        news.add(news2);
        news.add(news3);
        news.add(news4);
        news.add(news5);
        news.add(news6);
        news.add(news7);



        /*news.add(news8);
        news.add(news9);
        news.add(news10);*/


        for (News o : news) {
            System.out.println(o.getTitle());
        }
        System.out.println();
        System.out.println(news.contains(news10));

        /*Iterator iterator = news.iterator();
        while (iterator.hasNext()){
            //News a = (News) iterator.next();
            System.out.println(((News)iterator.next()).getId() + "-" + ((News)iterator.next()).getId());
        }*/

        /*System.out.println();ss
        System.out.println(news.getFirst().getTitle());
        System.out.println(news.getLast().getTitle());*/

        /*Set set = new HashSet();
        String s1 = new String("s1");
        String s2 = s1;
        String s3 = new String("s3");
        String s4 = new String("s4");
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set.size());*/


    }

}
