package com.daffy3.ch09;

public class Intro {
    // 12. 자바의 연산자들 - (관계, 논리 연산자)
    // 관계연산자
    // - 이항 연산자
    // - 연산의 결과가 True(참), false(거짓)으로 반환. 비교연산자 라고도 한다.
    // - 조건문, 반복문의 조건식으로 많이 사용된다.

    // 논리연산자
    // && 논리 곱: 두 항이 모두 참인 경우에만 결과 값이 참입니다. 그렇지 않은 경우는 거짓입니다.
    // || 논리 합: 두 항 중 하나의 항만 참이면 결과 값은 참입니다. 두 항이 모두 거짓이면 결과 값은 거짓입니다.
    // ! 부정: 단항 연산자입니다. 참인 경우는 거짓으로 바꾸고, 거짓인 경우는 참으로 바꿉니다.

    // 논리연산에서 모든 항이 실행되지 않는 경우 - 단락회로평가
    // - 논리 곱(&&)은 두 항의 결과가 모두 true일 때만 결과가 true
    // 앞의 항의 결과가 false 이면, 뒤 항의 결과를 평가하지 않음
    // - 논리 합(||)은 두항의 결과가 모두 false일 때만 결과가 false
    // 앞의 항의 결과가 true이면 뒤 항의 결과를 평가하지 않음
}