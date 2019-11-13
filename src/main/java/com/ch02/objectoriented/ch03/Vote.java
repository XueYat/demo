package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/21 16:58
 */
class Vote {
    private static final int VOTES = 100;
    private static int vote = 0;
    private String name;

    Vote(String name){
        this.name = name;
    }

    static int getVOTES() {
        return VOTES;
    }

    String vote(){
        vote++;
        return "感谢选民" + name + "的投票！";
    }

    static boolean isFinish(){
        return vote == VOTES;
    }
}
