package com.daffy3.ch09;

public class CalcTest {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 2;

        Calc calc = new CompleteCalc();
        System.out.println(calc.add(num1, num2)); // 12
        System.out.println(calc.substract(num1, num2)); // 8
        System.out.println(calc.times(num1, num2)); // 20
        System.out.println(calc.divide(num1, num2)); // 5

        CompleteCalc calc2 = new CompleteCalc();
        calc2.showInfo(); // 모두 구현하였습니다.
    }

}
