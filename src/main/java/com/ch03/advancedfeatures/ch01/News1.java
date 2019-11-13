package com.ch03.advancedfeatures.ch01;

import java.util.*;

/**
 * @author YatXue
 * @date 2019/4/1 15:13
 */
public class News1 {
    private int id;
    private String title;
    private String author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static void main(String[] args) {
        News1 n1 = new News1();
        News1 n2 = new News1();
        News1 n3 = new News1();
        n1.setId(1);
        n2.setId(2);
        n3.setId(3);
        n1.setTitle("111111111111111");
        n2.setTitle("222222222222222");
        n3.setTitle("333333333333333");
        n1.setAuthor("11");
        n2.setAuthor("22");
        n3.setAuthor("33");

        List news = new ArrayList();
        news.add(n1);
        news.add(n2);
        news.add(n3);

        System.out.println(news);

        for (Object o : news) {
            News1 n = (News1) o;
            System.out.println(n.getId() + "-" + n.getTitle() + "-" + n.getAuthor());
        }


        Set n = new HashSet();
        n.add(n1);
        n.add(n2);
        n.add(n3);

/*
        for (Object o : n) {
            System.out.println(o.hashCode());
            if (356573597 == o.hashCode()){
                System.out.println(true);
            }
        }*/

        Iterator iterator = n.iterator();
        while (iterator.hasNext()) {
            News1 news1 = (News1) iterator.next();
            System.out.print(news1.hashCode() + "-");
            System.out.println(news1.getId() + "-" + news1.getTitle() + "-" + news1.getAuthor());
        }
        System.out.println(n);
    }

}
