package com.daffy3.ch05;

public class Intro {
    // 06. 생성자에 대해 알아보자. (constructor)

    // 생성자
    // - 객체를 생성할 때, new 키워드와 함께 사용
    // - 생성자는 일반 함수처럼 기능을 호출하는 것이 아니고, 객체를 생성하기 위해 new와 함께 호출된다.
    // - 객체가 생성될 때, 변수나 상수를 초기화 하거나 다른 초기화 기능을 수행하는 메서드를 호출한다.
    // - 생성자는 반환 값이 없고, 클래스의 이름과 동일
    // - 대부분의 생성자는 외부에서 접근 가능하지만, 필요에 의해 private으로 선언되는 경우도 있다.

    // 기본 생성자 (default constructor)
    // - 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
    // - 클래스에 생성자를 구현하지 않아도 new 키워드와 함께 생성자를 호출할 수 있음
    // - 클래스에 생성자가 하나도 없는 경우, 컴파일러가 생성자 코드를 넣어준다.
    // - 매개변수가 없음. 구현부가 없음.

    // 07. 여러가지 생성자를 정의하는 생성자 오버로딩(overloading)
    // 생성자 정의하기
    // - 생성자를 구현해서 사용할 수 있음
    // - 클래스에 생성자를 따로 구현하면 기본 생성자(default constructor)는 제공되지 않음
    // - 생성자를 호출하는 코드에서 여러 생성자 중 필요에 따라 호출해서 사용할 수 있음
}
