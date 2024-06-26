package com.daffy3.ch08;

public class Intro {
    // 09. 자바에서 제공하는 자료구조 구현 클래스들 - 컬렉션 프레임워크
    // 컬렉션 프레임워크
    // - 프로그램 구현에 필요한 자료구조(Data Structure)를 구현해 놓은 JDK 라이브러리
    // - java.util 패키지에 구현되어 있음
    // - 개발에 소요되는 시간을 절약하면서 최적화 된 알고리즘을 사용할 수 있음
    // - 여러 구현 클래스와 인터페이스의 활용에 대한 이해가 필요함

    // ====================================================================================================

    // 10. 순차적으로 자료를 관리하는 List 인터페이스를 구현한 클래스와 그 활용
    // 멤버쉽 관리하기
    // - Member 클래스를 만들고, 아이디와 이름을 멤버변수로 선언
    // - Member 클래스로 생성된 인스턴스들을 관리하는 클래스를 컬렉션 프레임워크 클래스들을 활용하여 구현한다.

    // ====================================================================================================

    // 11. Collection 요소를 순회하는 Iterator
    // 요소의 순회란?
    // - 컬렉션 프레임워크에 저장된 요소들을 하나씩 차례로 참조하는 것
    // - 순서가 있는 List 인터페이스의 경우는 Iterator를 사용하지 않고, get(i) 메서드를 활용해서 조회할 수 있음
    // - Set 인터페이스의 경우 get(i) 메서드가 제공되지 않으므로 Iterator를 활용하여 객체를 순회함

    // Iterator 사용하기
    // - boolean hasNext(): 이후에 요소가 더 있는지를 체크하는 메서드, 요소가 있다면 True를 반환
    // - E next(): 다음에 있는 요소를 반환
}
