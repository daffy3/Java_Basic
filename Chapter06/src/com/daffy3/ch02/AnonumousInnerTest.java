package com.daffy3.ch02;

class Outer2 {

    static int sNum = 200;
    int outNum = 100;

    // 익명내부 클래스
    // - 이름이 없는 클래스
    // - 클래스의 이름을 생략하고 주로 하나의 인터페이스나 하나의 추상 클래스를 구현하여 반환
    // - 인터페이스나 추상 클래스 자료형의 변수에 직접 대입하여 클래스를 생성하거나 지역 내부 클래스의 메서드 내부에서 생성하여 반환 할 수 있음
    // - widget 이벤트 핸들러에 활용된다.

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable Class");
        }
    };

    Runnable getRunnable(final int i) {
        final int num = 10;

        class MyRunnable implements Runnable {
            int localNum = 1000;

            @Override
            public void run() {
                // int i와 num은 메서드가 호출하면서 생성이 되기 때문에 스택 메모리에 생성된다.
                // 그러나 run() 함수에서 i와 num의 값을 변경하려고 하면 오류가 나는데 그 이유는
                // getRunnable 메서드가 호출이 되고 끝이나면 int i, num 변수는 사라진다.
                // 그러나 run() 함수는 재호출 되 여지가 있다. 그래서 생성주기가 조금 다르기 때문에 오류가 날 수 있다.
                // 값을 assign 할 수 없을 수도 있기 때문에
                // 그래서 int i와 num을 final 처리를 하여 오류를 잡아준다. final 상수 메모리에 잡힌다. 대신 값을 바꿀 수 없다.
                // 상수화 되어 버렸기 때문에

                System.out.println("i = " + i);
                System.out.println("num = " + num);
                System.out.println("localNum = " + localNum);

                System.out.println("outNum = " + outNum + "(외부 클래스 인스턴스 변수)");
                System.out.println("Outer2.sNum = " + Outer2.sNum + "(외부 클래스 정적 변수)");

            }
        }
        return new MyRunnable();
    }
}

public class AnonumousInnerTest {

    public static void main(String[] args) {

        Outer2 out = new Outer2();
        Runnable runner = out.getRunnable(100);

        runner.run();

        out.runnable.run();
    }

}
