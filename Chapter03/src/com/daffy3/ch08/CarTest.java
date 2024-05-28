package com.daffy3.ch08;

public class CarTest {
    public static void main(String[] args) {
        Car aiCar = new AiCar();
        aiCar.run();

        Car mCar = new ManualCar();
        mCar.run();
    }
}
