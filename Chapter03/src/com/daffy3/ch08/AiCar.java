package com.daffy3.ch08;

public class AiCar extends Car {
    @Override
    public void drive() {
        System.out.println("자율주행을 합니다.");
        System.out.println("자동차가 스스로 방향을 바꿉니다.");
    }

    @Override
    public void stop() {
        System.out.println("장애물 앞에서 멈춥니다.");
    }
}
