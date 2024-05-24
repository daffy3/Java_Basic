package com.daffy3.ch07;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(100, "이순신");
        Student studentKim = new Student(200, "김유신");

        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 75);
        studentLee.showScoreInfo();

        studentKim.setKoreaSubject("국어", 85);
        studentKim.setMathSubject("수학", 50);
        studentKim.showScoreInfo();

    }

}
