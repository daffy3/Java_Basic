package com.daffy3.ch07;

public abstract class Computer {
    public abstract void display(); // 추상 메서드
    public abstract void typing(); // 추상 메서드

    public void turnOn() {
        System.out.println("전원을 켭니다.");
    }

    public void turnOff() {
        System.out.println("전원을 끕니다.");
    }
}
