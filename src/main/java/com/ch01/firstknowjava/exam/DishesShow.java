package com.ch01.firstknowjava.exam;

/**
 * @author YatXue
 * @date 2019/3/14 11:49
 */
class DishesShow {
    void show(){
        System.out.println("* * * * * * * * * * * * * * * * * *");
        System.out.println("序号\t\t菜名\t\t\t单价\t\t点赞数");
        for(int i = 0; i < Main.foodInfo.dishNames.length; i++){
            System.out.println((i + 1) + "\t\t" + Main.foodInfo.dishNames[i] + "\t\t" + Main.foodInfo.dishPrice[i] + "\t" + Main.foodInfo.dishLikes[i]);
        }
    }

    int order(){
        int nums = 0;
        for(int i = 0; i < Main.foodInfo.names.length; i++){
            if(Main.foodInfo.names[i] != null){
                nums = i + 1;
            }else{
                break;
            }
        }
        return nums;
    }
}
