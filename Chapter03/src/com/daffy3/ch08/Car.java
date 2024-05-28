package com.daffy3.ch08;

public abstract class Car {
    public abstract void drive();
    public abstract void stop();

    public void startCar() {
        System.out.println("시동을 켰습니다.");
    }

    public void turnOff() {
        System.out.println("시동을 껐습니다.");
    }

    // 아래 시나리오는 변하면 된다.
    final public void run() {
        // 시나리오 작성
        startCar();
        drive();
        stop();
        turnOff();
    }
}
