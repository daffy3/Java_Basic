package com.daffy3.ch03;

public class AddTest {

    public static void main(String[] args) {
        // 람다식 구현
        // - 매개변수가 하나인 경우 자료형과 괄호 생략가능
        // - 매개변수가 두 개 이상인 경우 괄호를 생략할 수 없음
        // - 실행문이 한 문장인 경우 중괄호 생략 가능
        // - 실행문이 한 문장이라도 return 문(반환문)은 중괄호를 생략할 수 없음
        // - 실행문이 한 문장의 반환문인 경우엔 return과 중괄호를 모두 생략가능
        Add addElement = (x, y) -> {
            return x + y;
        };
        System.out.println(addElement.add(10, 20));
    }

}
