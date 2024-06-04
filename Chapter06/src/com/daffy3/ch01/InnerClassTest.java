package com.daffy3.ch01;

class OutClass {

    private static int sNum = 20;
    private int num = 10;
    private InClass inClass;

    public OutClass() {
        inClass = new InClass();
    }

    public void usingClass() {
        inClass.inTest();
    }

    // 정적내부클래스
    static class InStaticClass {
        static int sInNum = 200;
        int iNum = 100;

        void inTest() {
            // System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // => 오류가 나는 이유는 Static Method 이기 때문에 외부 클래스가 생성되기 전에 접근 가능할 수 있기 때문에
            System.out.println("OutClass sNum = " + sInNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }

        static void sTest(){
            System.out.println("OutClass sNum = " + sInNum + "(외부 클래스의 스태틱 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
            // System.out.println("OutClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

    private class InClass {
        int iNum = 100;

        // InClass는 OutClass가 생성이 되고 생성이 되기 때문에
        // static 변수는 OutClass 생성이랑 무관하기 때문에
        // inner class에서는 정적 변수를 생성할 수 없다. 굳이 사용하려면 정적 내부 클래스를 만들고 사용해야한다.
        // static int sInNum = 500;

        void inTest() {
            System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass inNum = " + iNum + "(내부 클래스의 인스턴스 변수)");
        }
    }

}

public class InnerClassTest {

    public static void main(String[] args) {

        OutClass outClass = new OutClass();
        outClass.usingClass();

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        sInClass.inTest();

    }

}
