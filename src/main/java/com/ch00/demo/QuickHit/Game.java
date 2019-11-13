package com.ch00.demo.QuickHit;

import java.util.Random;

public class Game {
    private Player player;
    boolean flag = true;

    public Game(Player player){
        this.player = player;
    }

    public String printStr(){
        StringBuffer buffer = null;
        LevelParam lp = new LevelParam();
        for(int i = 0; i < lp.levels.length; i++) {
            if (player.getLevelNo() == lp.levels[i].getLevelNo()) {
                buffer = new StringBuffer();
                Random random = new Random();
                for(int j = 0; j < lp.levels[i].getStrLength(); j++) {
                    int rand = random.nextInt(lp.levels[i].getStrLength());
                    switch (rand) {
                        case 0:
                            buffer.append(">");
                            break;
                        case 1:
                            buffer.append("<");
                            break;
                        case 2:
                            buffer.append("*");
                            break;
                        case 3:
                            buffer.append("&");
                            break;
                        case 4:
                            buffer.append("%");
                            break;
                        case 5:
                            buffer.append("#");
                            break;
                    }
                }
            }
        }
        return String.valueOf(buffer);
    }

    public void printResult(String out, String in){
        if(out.equals(in)){
            long currentTime = System.currentTimeMillis();
//            System.out.println("开始时间：" + player.getStartTime());
//            System.out.println("结束时间：" + currentTime);
//            System.out.println("时间差：" + ((currentTime - player.getStartTime()) / 1000));
//            System.out.println("等级时间：" + LevelParam.levels[player.getLevelNo() - 1].getTimeLimit());
            if((((currentTime - player.getStartTime()) / 1000)) > LevelParam.levels[player.getLevelNo() - 1].getTimeLimit()){
                System.out.println("输入太慢，已经超时，退出系统");
                flag = false;
            }else{
                player.setCurrScore(player.getCurrScore() + LevelParam.levels[player.getLevelNo() - 1].getPerScore());
                System.out.println("输入正确，您的级别为：" + player.getLevelNo() + "，您的积分为：" + player.getCurrScore() + "，已用时间：" + (((currentTime - player.getStartTime()) / 1000)) + "秒。");
                flag = true;
            }
        }else{
            System.out.println("输入错误，退出系统！");
            flag = false;
        }
    }
}
