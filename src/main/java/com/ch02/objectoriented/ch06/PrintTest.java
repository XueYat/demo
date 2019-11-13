package com.ch02.objectoriented.ch06;

/**
 * @author YatXue
 * @date 2019/3/27 11:23
 */
public class PrintTest {
    public static void main(String[] args) {
        PaperA4 a4 = new PaperA4();
        PaperB5 b5 = new PaperB5();
        InkCartridgeBlank blank = new InkCartridgeBlank();
        InkCartridgeColor color = new InkCartridgeColor();
        Print print = new Print();
        print.print(a4, blank);
        print.print(b5, color);
    }
}
