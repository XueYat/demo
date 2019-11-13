package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/23 13:51
 */
public class Demo08Test {
    public static void main(String[] args) {
        Demo08Dog demo08Dog = new Demo08Dog("欧欧", 80, 90, "雪纳瑞犬");
        demo08Dog.info();
        Demo08Penguin demo08Penguin = new Demo08Penguin("楠楠", 80, 80, "Q妹");
        demo08Penguin.info();
        Demo08Master master = new Demo08Master();
        master.cure(demo08Dog);
        master.cure(demo08Penguin);
    }
}
