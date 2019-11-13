package com.ch03.advancedfeatures.ch05;

/**
 * @author YatXue
 * @date 2019/4/11 14:53
 */
public class Test implements Runnable{
    private String num;

    public Test(int num){
        this.num = num + "";
    }

    public static void main(String[] args) {
        int[] nums = {5000, 1000, 3000, 1800, 4500, 9000};
        for (int num : nums) {
            new Thread(new Test(num)).start();
        }
    }

    @Override
    public void run() {
        try {
            Thread.sleep(Integer.parseInt(num));
            System.out.println(num);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
