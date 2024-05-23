package com.daffy3.ch03;

public class StudentTest {

    public static void main(String[] args) {

        Student studentLee = new Student(); // 이와 같이 생성되는 객체를 '인스턴스' 라고 한다.
        Student studentKim = new Student();

        studentLee.studentId = 12345;
        studentLee.studentName = "daffy3";
        studentLee.address = "서울특별시 서초구";
        studentLee.showStudentInfo();

        studentKim.studentId = 54321;
        studentKim.studentName = "daffy1";
        studentKim.address = "서울특별시 서초구";

        studentKim.showStudentInfo();

    }

}
