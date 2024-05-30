package ch02;

public class EqualsTest {

    public static void main(String[] args) {
        Student student01 = new Student(10010, "Lee");
        Student student02 = new Student(10010, "Lee");

        System.out.println(student01 == student02); // false
        System.out.println(student01.equals(student02)); // false ===> 두 인스턴스의 주소값을 비교하기 때문에
        // 그러나 클래스에 담긴 데어터는 물리적인 주소는 다르지만, 논리적으로 동일한 데이터이기 때문에
        // Student @Overriding hashCode() 전
        System.out.println(student01.hashCode()); // 168423058
        System.out.println(student02.hashCode()); // 821270929

        // Student @Overriding hashCode() 후
        System.out.println(student01.hashCode()); // 10010
        System.out.println(student02.hashCode()); // 10010
        // 실제 가상메모리 값 출력
        System.out.println(System.identityHashCode(student01)); // 168423058
        System.out.println(System.identityHashCode(student02)); // 821270929
    }

}
