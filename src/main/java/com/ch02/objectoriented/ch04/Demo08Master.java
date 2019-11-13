package com.ch02.objectoriented.ch04;

/**
 * @author YatXue
 * @date 2019/3/25 11:20
 */
public class Demo08Master {
    void cure(Demo08Pet pet){
        if (pet instanceof Demo08Dog){
            System.out.println("狗狗打针，吃药");
        }else if (pet instanceof Demo08Penguin){
            System.out.println("企鹅吃药，疗养");
        }
        //pet.cure();
    }
}