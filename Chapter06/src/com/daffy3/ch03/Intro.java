package com.daffy3.ch03;

public class Intro {
    // 03. 람다식(Lambda expression)

    // 함수형 프로그래밍과 람다식
    // - 자바는 객체지향 프로그래밍: 기능을 수행하긴 위해서는 객체를 만들고 그 객체 내부에 멤버 변수를 선언하고 기능을 수행하는 메서드를 구현
    // - 자바 8부터 함수형 프로그래밍 방식을 지원하고 이를 람다식이라고 한다.
    // - 함수의 구현과 호출만으로 프로그래밍이 수행되는 방식
    // - 함수형 프로그래밍(Functional Programming)
    //   함수형 프로그래밍은 순수함수(pure function)를 구현하고, 호출함으로써 외부 자료에 부수적인 영향(side effect)를 주지 않도록 구현하는 방식이다.
    //   순수함수란, 매개변수만을 사용하여 만드는 함수이다. 즉, 함수 내부에서 함수 외부에 있는 변수를 사용하지 않아 함수가 수행되더라도 외부에는 영향을 주지 않는다.
    //   함수를 기반으로 하는 프로그래밍이고, 압력받는 자료 이외에 외부 자료를 사용하지 않아 여러자료가 동시에 수행되는 병렬처리가 가능하다.
    //   함수형 프로그래밍은 함수의 기능이 자료에 독립적임을 보장한다. 이는 동일한 자료에 대해 동일한 결과를 보장하고, 다양한 자료에 대해 같은 기능을 수행할 수 있다.

    // 람다식 문법
    // - 익명함수 만들기
    // - 매개변수와 매개변수를 이용한 실행문

    // ====================================================================================================

    // 함수형 인터페이스 선언하기
    // - 람다식을 선언하기 위한 인터페이스
    // - 익명함수와 매개변수만으로 구현되므로 인터페이스는 단 하나의 메서드만을 선언해야한다.
    // - @FunctionalInterface 애노테이션(Annotation): 함수형 인터페이스라는 의미, 내부에 여러 개의 메서드를 선언하면 에러가 난다.
    //   매서드 이름을 사용하지 않기 때문에 여러 메서드를 선언하면 모호해지기 때문이다.
}
