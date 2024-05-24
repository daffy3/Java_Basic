package com.daffy3.ch08;

public class BirthdayTest {

    public static void main(String[] args) {

        Birthday date = new Birthday();

        date.setYear(2024);
        date.setMonth(12);
        date.setDay(24);
        date.showDate();

        // 멤버변수의 오용을 / 오류를 객체의 역할에 대해 문제가 생길 수 있기 때문에 private으로 막아준다.

    }

}
