package com.ch00.demo.demo1.Demo;

import java.util.Scanner;
public class User {

    static Scanner sc = new Scanner(System.in);
    String[] user = new String[5];
    static String name;
    int num = 0;

    public void adduser(){
        for(int i = 0; i < user.length; i++){
            System.out.print("请输入客户姓名：");
            user[i] = sc.next();
        }
    }

    public void displayuser(){
        System.out.println("***********客户信息显示***********");
        for(int i = 0; i < user.length; i++){
            System.out.print(user[i] + "\t\t");
        }
        System.out.println();
    }

    public boolean searchuser(int start, int end, String name){
        boolean find = false;
        for(int i = start- 1; i < end; i++) {
            if(user[i].equals(name)) {
                find = true;
                num = i;
                break;
            }
        }
        return find;
    }

    public void updateuser(){
        user[num] = name;
        System.out.println("修改成功！");
        displayuser();
    }

    public static void main(String[] args){
        User u = new User();
        u.adduser();
        u.displayuser();
        System.out.print("请选择要修改的姓名：");
        name = sc.next();
        if(u.searchuser(1 , 5, name)) {
            System.out.print("姓名存在，请输入新的姓名：");
            name = sc.next();
            u.updateuser();
        }else{
            System.out.println("没找到该学生！");
        }
    }
}
