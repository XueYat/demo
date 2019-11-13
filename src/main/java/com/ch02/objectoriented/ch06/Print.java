package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/27 11:18
 */
public class Print {
    Paper paper = null;
    InkCartridge inkCartridge = null;

    /**
     * @methodName print
     * @author YatXue
     * @date 2019/3/27 17:27
     * @description 
     * @param paper 
 * @param inkCartridge
     * @return void
     */
    void print(Paper paper, InkCartridge inkCartridge){
        this.paper = paper;
        this.inkCartridge = inkCartridge;
        System.out.println("使用" + this.inkCartridge.color() + "墨盒在" + this.paper.size() + "上打印...");
    }
}
