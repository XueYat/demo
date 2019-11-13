package com.ch00.demo.QuickHit;

import java.util.Scanner;

public class Player {
    private int levelNo;        //玩家当前级别
    private int currScore;      //玩家当前级别积分
    private long startTime;     //当前级别开始时间
    private int elapsedTime;    //当前级别已用时间

    public int getLevelNo() {
        return levelNo;
    }

    public void setLevelNo(int levelNo) {
        this.levelNo = levelNo;
    }

    public int getCurrScore() {
        return currScore;
    }

    public void setCurrScore(int currScore) {
        this.currScore = currScore;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public int getElapsedTime() {
        return elapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        this.elapsedTime = elapsedTime;
    }

    public void play(){
        Scanner sc = new Scanner(System.in);
        Player player = new Player();
        player.setLevelNo(1);
        Game g = new Game(player);
        String outStr, inStr;
        long currentTime;
        int i = 1;

        for(;;) {
            if(g.flag) {
                outStr = g.printStr();
                System.out.println("符号如下：\n" + outStr);
                if (i == 1) {
                    currentTime = System.currentTimeMillis();
                    player.setStartTime(currentTime);
                }
                System.out.print("请还原输入以上符号：");
                inStr = sc.next();
                g.printResult(outStr, inStr);
                i++;
                if(i == LevelParam.levels[player.getLevelNo() - 1].getStrTimes()){
                    i = 1;
                    player.setLevelNo(player.getLevelNo() + 1);
                    System.out.println("======================================================");
                    System.out.println("您现在的等级为：" + player.getLevelNo() + "，积分为：" + player.getCurrScore());
                }
                if(player.getLevelNo() == LevelParam.levels[5].getLevelNo()){
                    System.out.println("恭喜您，通关啦！");
                }
            }else{
                break;
            }
        }
    }
}
