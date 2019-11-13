package com.ch02.objectoriented.ch07;

/**
 * @author YatXue
 * @date 2019/3/28 11:23
 */
public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.calculate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
