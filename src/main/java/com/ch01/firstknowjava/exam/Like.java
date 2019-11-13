package com.ch01.firstknowjava.exam;

import java.util.Scanner;

/**
 * @author YatXue
 * @date 2019/3/14 9:07
 */
class Like {
    private static Scanner sc = new Scanner(System.in);
    void iLikeIt(){
        int num, nums = 0;
        System.out.println("**************我要点赞**************");
        Main.dishesShow.show();
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.print("请选择您要点赞的菜品编号：");
        num = sc.nextInt();
        for(int i = 0; i < Main.foodInfo.dishNames.length; i++){
            if(Main.foodInfo.dishNames[i] != null){
                nums = i + 1;
            }else{
                break;
            }
        }
        for(int i = 0; i < Main.foodInfo.dishNames.length; i++){
            if(num == (i + 1)){
                Main.foodInfo.dishLikes[num - 1] += 1;
                System.out.println("点赞成功！");
            }
            if(num > nums){
                System.out.println("不存在该菜品编号信息！");
                break;
            }
        }
        System.out.print("输入任意键返回！");
        sc.next();
    }
}
