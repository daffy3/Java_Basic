package com.daffy3.ch01;

public class Intro {
    // 01. 객체와 객체지향 프로그래밍
    // 객체(Objecrt)
    // - 의사나 행위가 미치는 대상 (사전적 의미)
    // - 구체적, 추상적 데이터의 단위 (학생, 회원, 생산, 주문, 배송 등)

    // 객체지향 프로그램은 어떻게 구현하는가?
    // - 객체를 정의하고
    // - 각 객체가 제공하는 기능들을 구현하고
    // - 각 객체가 제공하는 기능들 간의 소통을 통하여 객체 간의 협력을 구현한다.

    // 02. 생활 속에서 객체를 찾아 클래스로 구현해보기
    // 객체를 찾아봅시다.
    // - 온라인 쇼핑몰에 회원들이 로그인을 하고 여러 판매자가 판매하고 있는 제품 중 하나를 골라 주문한다.
    // =====> 회원 / 판매자 / 제품 / 주문

    // 클래스는 객체의 청사진(Blueprint)이다.
    // - 객체의 속성은 클래스의 멤버변수(member variable)로 선언한다.
    // - 학생 클래스
    public class Student {
        int studentNumber;
        String studentName;
        int majorCode;
        String majorName;
        int grade;
    }
}
