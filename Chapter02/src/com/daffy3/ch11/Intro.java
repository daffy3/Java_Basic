package com.daffy3.ch11;

public class Intro {
    // 16. 여러 인스턴스에서 공통으로 사용하는 변수를 선언하자. - static 변수
    // 공통으로 사용하는 변수가 필요한 경우
    // - 여러 인스턴스가 공유하는 기준 값이 필요한 경우
    // - ex) 학생마다 새로운 학번 생성할 때
    // - ex) 카드회사에서 카드를 새로 발급할 때마다 새로운 카드번호를 부여
    // - ex) 회사에서 사원이 입사할 때마다 새로운 사번 부여

    // static 변수선언과 사용하기
    // - 인스턴스가 생성될 때 만들어지는 변수가 아닌, 처음 프로그램이 메모리에 로딩될 때 메모리를 할당
    // - 클래스 변수, 정적변수라고도 한다.
    // - 인스턴스 생성과 상관없이 사용 가능하므로 클래스 이름으로 직접 참조
}