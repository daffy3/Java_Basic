package com.daffy3.ch02;

public class FunctionTest {

    public static int addNum(int num1, int num2) {
        int result;
        result = num1 + num2;

        return result;
    }

    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    public static int calcSum() {
        int sum = 0;
        int i;

        for (i = 0; i <= 100; i++) {
            sum += i;
        }

        return sum;
    }

    // 함수 호출과 스택 메모리
    // - 스택: 함수가 호출될 때 지역변수들이 사용하는 메모리
    // - 함수의 수행이 끝나면 자동으로 반한되는 메모리

    // 아래 코드에서 n1과 n2는 main 함수가 사용할 메모리 공간이 스택에 생성됨
    // addNum에서 사용되는 num1, num2, result는 지역변수라고 하며, addNum 함수의 메모리 공간이 스택에 생성됨
    // 그러나 값이 반환되면 자동으로 메모리가 없어진다.
    // 지역변수 같은 경우에는, 그 함수의 수행이 완료되면 없어진다.
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;

        int total = addNum(n1, n2);
        System.out.println(total); // 30

        sayHello("안녕하세요."); // 안녕하세요.

        total = calcSum();
        System.out.println(total); // 5050
    }

}
