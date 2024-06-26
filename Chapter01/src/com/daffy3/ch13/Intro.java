package com.daffy3.ch13;

public class Intro {

    // 17. 반복문 - while문

    // 조건이 참(true)인 동안 반복수행하기
    // - 주어진 조건에 맞는 동안(true) 지정된 수행문을 반복적으로 수행하는 제어문
    // - 조건이 맞지 않으면 반복하던 수행을 멈추게 된다.
    // - 조건은 주로 반복 횟수나 값의 비교의 결과에 따라 true, false 판단된다.
    // - 예) 달리는 자동차, 일정 횟수만큼 돌아가는 나사못, 특정온도까지 가동되는 에어컨 등

    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println(sum);
        System.out.println(num);
    }

}
