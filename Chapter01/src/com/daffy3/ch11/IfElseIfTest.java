package com.daffy3.ch11;

public class IfElseIfTest {

    public static void main(String[] args) {

        int age = 17;
        int charge = 3000;

        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동입니다.");
        } else if (age < 14) {
            charge = 2000;
            System.out.println("초등학생 입니다.");
        } else if (age < 20) {
            charge = 2500;
            System.out.println("중, 고등학생 입니다.");
        } else {
            charge = 3000;
            System.out.println("일반인 입니다.");
        }

        System.out.println("입장료는 " + charge + "입니다.");

    }

}
