package com.daffy3.ch07;

public class Desktop extends Computer {
    @Override
    public void display() {
        System.out.println("데스크탑 디스플레이");
    }

    @Override
    public void typing() {
        System.out.println("데스크탑 타이핑");
    }
}
