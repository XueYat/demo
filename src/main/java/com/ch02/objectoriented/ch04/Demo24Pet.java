package com.ch02.objectoriented.ch04;

import com.ch02.objectoriented.ch01.Demo24;

/**
 * @author YatXue
 * @date 2019/3/23 15:57
 */
public class Demo24Pet {
    String name;

    Demo24Pet(){

    }

    Demo24Pet(String name) {
        this.name = name;
    }

    void info(){
        System.out.print("名称：" + this.name);
    }

    void recognition(){
        System.out.println(this.name + "认主成功！");
    }
}
