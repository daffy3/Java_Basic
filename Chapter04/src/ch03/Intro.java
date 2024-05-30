package ch03;

public class Intro {
    // 03. String, StringBuilder, StringBuffer 클래스, text block

    // String 클래스
    // - String 선언하기
    String str1 = new String("abc");
    String str2 = "abc";
    // - 힙 메모리에 인스턴스로 생성되는 경우와 상수 풀(constant pool)에 있는 주소를 참조하는 두 가지 방법
    // - 힙 메모리는 생성될 때마다 다른 주소 값을 가지지만, 상수 풀의 문자열은 모두 같은 주소 값을 가진다.
    // - 한 번 생성된 String은 불변(immutable)이다.
    // - String을 연결하면 기존의 String에 연결되는 것이 아닌 새로운 문자열이 생성된다.

    // StringBuilder, StringBuffer 활용하기
    // - 내부적으로 가변적인 char[]를 멤버변수로 가짐
    // - 문자열을 여러 번 연결하거나 변경할 때, 사용하면 유용하다.
    // - 새로운 인스턴스를 생성하지 않고, char[]를 변경함
    // - StringBuffer는 멀티쓰레드 프로그래밍에서 동기화를 보장
    // - 단일 쓰레드 프로그램에서는 StringBuilder 사용을 권장
    // - toString() 메서드로 String 반환

}
