package com.daffy3.ch09;

// 인터페이스를 구현한다는 의미로 접근해야한다.
// 그래서 implements 키워드를 사용한다.

public abstract class Calculator implements Calc {

    @Override
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int substract(int num1, int num2) {
        return num1 - num2;
    }
}
