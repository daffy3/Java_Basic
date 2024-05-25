package com.daffy3.ch12;

public class Intro {
    // 변수의 유효범위와 메모리
    // - 변수의 유효범위와 생성과 소멸은 각 변수의 종류마다 다르다.
    // - 지역변수, 멤버변수, 클래스 변수는 유효범위와 life cycle, 사용하는 메모리도 다르다.

    // 1. 지역변수(로컬변수)는 함수 내부에 선언되며, 함수 내부에서만 사용된다. 메모리는 스택에 쌓인다. 함수가 호출될 때 생성되고, 함수가 끝나면 소멸한다.
    // 2. 멤버변수(인스턴스 변수)는 클래스 멤버변수로 선언되며, 클래스 내부에서 사용하고 private 아니면 참조변수로 다른 클래스에서 사용가능하다. 힙 메모리에 쌓이며,
    // 인스턴스가 생성될 때, 힙에 생성되고, 가비지 컬렉터가 메모리를 수거할 때 소멸된다.
    // 3. static 변수(클래스 변수)는 static 예약어를 사용하여 클래스 내부에 선언한다. 클래스 내부에서 사용하고 private 아니면 클래스 이름으로 다른 클래스에서 사용이 가능하다.
    // 데이터 영역에 쌓이며, 프로그램이 처음 시작할 때 상수와 함께 데이터 영역에 생성되고 프로그램이 끝나고 메모리를 해제할 때 소멸된다.

    // ====================================================================================================

    // * static 응용 - 싱글톤 패턴(singleton pattern)
    // 싱글톤 패턴이란?
    // - 프로그램에서 인스턴스가 단 한 개만 생성되어야 하는 경우, 사용하는 디자인 패턴
    // - static 변수, 메서드를 활용하여 구현할 수 있다.
}