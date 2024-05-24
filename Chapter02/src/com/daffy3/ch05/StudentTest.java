package com.daffy3.ch05;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(10010, "Lee", 6);
        // 아무런 정보를 주지 않았기 때문에 초기화된 값을 출력한다.
        // String은 객체이기 때문에 null로, int는 0으로 초기화 된다.
        System.out.println(studentLee.showStudentInfo()); // null학생의 학번은 0이고, 0학년 입니다.

    }

}
