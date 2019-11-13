package com.ch02.objectoriented.ch03;

/**
 * @author YatXue
 * @date 2019/3/22 11:46
 */
public class VoterTest {

    public static void main(String[] args) {
        for (int i = 1; !Voter.isFinish(); i++) {
            Voter voter = new Voter(i);
            voter.vote();
        }
    }
}
