package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/21 16:58
 */
public class VoteTest {
    public static void main(String[] args) {
        for (int i = 1; !Vote.isFinish(); i++) {
            Vote vote = new Vote(Integer.toString(i));
            System.out.println(vote.vote());
        }
        System.out.println("投票结束，总票数为：" + Vote.getVOTES());
    }
}
