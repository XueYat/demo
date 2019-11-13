package com.ch02.objectoriented.ch02;

/**
 * @author YatXue
 * @date 2019/3/19 10:55
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(1, 2));
        System.out.println(calculator.sum(1.5, 2.5,  3.5));
    }
}
