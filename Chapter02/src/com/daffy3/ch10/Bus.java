package com.daffy3.ch10;

public class Bus {
    int busNumber;
    int passengerCount;
    int income;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int money) {
        this.income += money;
        this.passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번의 승객수는 " + passengerCount + "명이고, 수입은 " + income + "원 입니다.");
    }
}
