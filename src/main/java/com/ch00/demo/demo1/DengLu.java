package com.ch00.demo.demo1.Demo;

import java.util.Calendar;
import java.util.Scanner;
public class DengLu {
    public static void main(String[] args) {
        for(int i = 2;i >= 0;i--){
            String zhanghao = "admin";
            int mima = 123;
            Scanner input = new Scanner(System.in);
            System.out.println("欢迎进入我行我素购物管理系统！");
            System.out.print("请输入用户名：");
            String yonghuming = input.next();
            System.out.print("请输入密  码：");
            int password = input.nextInt();
            if(yonghuming.equals(zhanghao)  && password == mima){
                System.out.println("欢迎进入我行我素购物管理系统！");
                int[] custNo = new int[10];				//会员号
                String[] custBirth = new String[10];		//会员生日
                int[] custScore = new int[10];			//会员积分
                custNo [0] = 1623;
                custBirth [0] = "3月26日";
                custScore [0] = 5000;
                custNo [1] = 1545;
                custBirth [1] = "11月12日";
                custScore [1] = 2200;
                for(;;){
                    System.out.println("\n\n\t\t\t\t欢迎使用我行我素购物管理系统\n");
                    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                    System.out.println("\t\t\t\t 1. 客 户 信 息 管 理\n");
                    System.out.println("\t\t\t\t 2. 购 物 结 算\n");
                    System.out.println("\t\t\t\t 3. 真 情 回 馈\n");
                    System.out.println("\t\t\t\t 4. 退 出\n");
                    System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                    System.out.print("请选择,输入数字:");
                    int no = input.nextInt();
                    if(no == 1){
                        for(;;){
                            System.out.println("我行我素购物管理系统 > 客户信息管理\n");
                            System.out.println(" * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * *\n");
                            System.out.println("\t\t 1. 显 示 所 有 客 户 信 息\n");
                            System.out.println("\t\t 2. 添 加 客 户 信 息\n");
                            System.out.println("\t\t 3. 返 回\n");
                            System.out.println(" * * * * * * * * * * * * * * * * * * * *  * * * * * * * * * * *\n");
                            System.out.print("请选择,输入数字:");
                            int no1 = input.nextInt();
                            int custNo2;
                            String custBrith2;
                            int custScore2;
                            if (no1 == 1) {
                                System.out.println("执行显示所有客户信息");
                                System.out.println("显示客户信息");
                                System.out.println("会员号\t生日\t积分");
                                System.out.println("-------|-------|-------");
                                for(int o = 0 ; o < custNo.length ; o++){
                                    if(custNo[o] != 0){
                                        System.out.print(custNo[o] + "\t" + custBirth[o] + "\t" + custScore[o] + "\n");
                                    }
                                }
                            } else if (no1 == 2) {
                                System.out.println("执行添加客户信息");
                                System.out.print("请输入四位会员号(四位整数！)：");
                                custNo2 = input.nextInt();
                                System.out.print("请输入生日(月、日<用两位数表示！>)：");
                                custBrith2 = input.next();
                                System.out.print("请输入积分：");
                                custScore2 = input.nextInt();

                                for(int o = 2 ; o < custNo.length ; o++){
                                    if(custNo[o] == 0){
                                        custNo[o] = custNo2;
                                        custBirth[o] = custBrith2;
                                        custScore[o] = custScore2;
                                        System.out.println("新会员添加成功！");
                                        break;
                                    }
                                }
                            } else if (no1 == 3) {
                                break;
                            }  else {
                                System.out.println("输入错误");
                            }
                        }
                    }else if(no == 2){
                        System.out.println("执行购物结算");
                        String name = "";
                        double price = 0;
                        int goodsNo;
                        int shu;
                        double he = 0 , je = 0 , zq , zk = 0.8 , jf;
                        System.out.println("*****************************************");
                        System.out.println("请选择购买的商品编号：\n");
                        System.out.println("1.T恤   2. 网球鞋  3. 网球拍");
                        System.out.println("****************************************\n");
                        String answer = "y";
                        while (answer.equals("y")) {
                            System.out.print("请输入商品编号： ");
                            goodsNo = input.nextInt();
                            System.out.print("请输入购买数量： ");
                            shu = input.nextInt();
                            switch (goodsNo) {
                                case 1:
                                    name = "T恤";
                                    price = 245;
                                    break;
                                case 2:
                                    name = "网球鞋";
                                    price = 570;
                                    break;
                                case 3:
                                    name = "网球拍";
                                    price = 320;
                                    break;
                            }
                            System.out.println(name + "\t\t" + "￥" + price +  "\t\t" + "￥" + price * shu); // 输出商品名称和价格
                            System.out.print("\n是否继续（y/n）");
                            answer = input.next();

                            he = he + price * shu;
                            je = he * zk;
                        }
                        System.out.println("折扣：" + zk);
                        System.out.println("金额总计：￥" + je);
                        System.out.print("实际交费：￥");
                        jf = input.nextDouble();
                        zq = jf - je;
                        System.out.println("找钱：￥" + zq);
                    }else if(no == 3){
                        for(;;){
                            System.out.println("我行我素购物管理系统 > 真情回馈\n");
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                            System.out.println("\t\t\t\t 1. 幸 运 大 放 送\n");
                            System.out.println("\t\t\t\t 2. 幸 运 抽 奖\n");
                            System.out.println("\t\t\t\t 3. 生 日 问 候\n");
                            System.out.println("\t\t\t\t 4. 返 回\n");
                            System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                            System.out.print("请选择,输入数字：");
                            int no2 = input.nextInt();
                            if (no2 == 1) {
                                System.out.println("执行幸运大放送");
                                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                                System.out.println("\t\t\t\t 1. 积 分 抽 奖\n");
                                System.out.println("\t\t\t\t 2. 猜 数 抽 奖\n");
                                System.out.println("\t\t\t\t 3. 返 回\n");
                                System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *\n");
                                System.out.print("请选择,输入数字：");
                                int no3 = input.nextInt();
                                if(no3 == 1){
                                    System.out.println("执行积分抽奖");
                                    int max=1;
                                    int o=0,m=0;
                                    for(;o<custScore.length;o++){
                                        if(max<custScore [o]){
                                            max=custScore [o];
                                            m=o;
                                        }
                                    }
                                    System.out.println("具有最高积分的会员是"+custNo[m]+"\t"+custBirth[m]+"\t"+custScore[m]);
                                    System.out.println("赠送苹果电脑一台！");
                                }else if(no3 == 2){
                                    System.out.println("执行猜数抽奖");
                                    System.out.println("我心里有一个0-10之间的整数，你猜是什么？");
                                    int number = (int)(Math.random()*10);
                                    int ci = 1;
                                    for(;ci < 10;ci++){
                                        int shu = input.nextInt();
                                        if(shu == number){
                                            System.out.println("猜对了！");
                                            break;
                                        }else if(shu < number){
                                            System.out.println("小了点，再试试！");
                                        }else {
                                            System.out.println("大了点，再猜！");
                                        }
                                    }
                                    if(ci == 1){
                                        System.out.println("你太有才了！赠送苹果手机一台");
                                    }else if(ci > 1 && ci <= 5){
                                        System.out.println("这么快就猜出来了，很聪明么！赠送苹果一袋！");
                                    }else if(ci > 5){
                                        System.out.println("猜了半天才猜出来，很遗憾，您没有获得礼物！");
                                    }break;
                                } else if (no3 == 3) {
                                    break;
                                }  else {
                                    System.out.println("输入错误");
                                }
                            } else if (no2 == 2) {
                                System.out.println("执行幸运抽奖");
                                String answer = "y";
                                while (answer.equals("y")) {
                                    System.out.print("请输入四位会员号：");
                                    int o = input.nextInt();
                                    int random = (int)(Math.random() * 10);
                                    int g = o / 100 % 10;
                                    while(o >= 10000 || o <= 999){
                                        System.out.println("请重新输入四位会员号!");
                                        System.out.print("请输入四位会员号：");
                                        o = input.nextInt();
                                    }
                                    switch(g = random){
                                        case 1:
                                            System.out.println( + o + "是幸运客户，获得精美Mp3一个。");
                                            break;
                                        default:
                                            System.out.println( + o + "谢谢您的支持。");
                                    }
                                    /*if (g == random){
                                        System.out.println( + o + "是幸运客户，获得精美Mp3一个。");
                                    }else {
                                        System.out.println( + o + "谢谢您的支持。");
                                    }*/
                                    System.out.print("\n是否继续（y/n）");
                                    answer = input.next();
                                }
                            } else if (no2 == 3) {
                                System.out.println("执行生日问候");
                                Calendar cal = Calendar.getInstance();
                                int day = cal.get(Calendar.DATE);
                                int month = cal.get(Calendar.MONTH) + 1;
                                System.out.println("今天是" + month + "月" + day + "日");
                                for(int o = 0 ; o < custNo.length ; o++){
                                    if(custBirth[o].equals(month + "月" + day + "日")){
                                        System.out.println("恭喜" + custNo[o] + "号会员生日快乐，获得100元的免单哦！");
                                        break;
                                    }else{
                                        System.out.println("今天没有会员生日！");
                                        break;
                                    }
                                }
                            } else if (no2 == 4) {
                                break;
                            } else {
                                System.out.println("输入错误");
                            }
                        }
                    }else if(no == 4){
                        break;
                    }else {
                        System.out.print("输入错误, 请重新输入数字：");
                    }
                }
                break;
            }else if(i > 0){
                System.out.println("用户名和密码不匹配！");
                System.out.println("你还有" + i + "次机会，请重新输入！");
            }else if(i == 0){
                System.out.println("您没有权限进入系统！");
                break;
            }
        }
        System.out.println("程序结束！");
    }
}
