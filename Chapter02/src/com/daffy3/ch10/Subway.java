package com.daffy3.ch10;

public class Subway {
    int lineNumber;
    int passengerCount;
    int income;

    public Subway(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println(lineNumber + "호선의 승객수는 " + passengerCount + "명이고, 수입은 " + income + "원 입니다.");
    }
}
