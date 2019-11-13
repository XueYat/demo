package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/22 11:45
 */
public class Voter {
    static final int MAXVOTES = 100;
    static int votes = 0;
    int name;
    Voter(int name){
        this.name = name;
    }

    void vote(){
        votes++;
        System.out.println("感谢选民" + name + "投票，目前总票数：" + votes);
    }

    static boolean isFinish(){
        return MAXVOTES == votes;
    }
}
