package com.daffy3.ch16;

public class SubjectTest {

    public static void main(String[] args) {

        Student studentLee = new Student(1001, "이순신");
        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 50);

        Student studentKim = new Student(1002, "김유신");
        studentKim.addSubject("국어", 70);
        studentKim.addSubject("수학", 85);
        studentKim.addSubject("영어", 100);

        studentLee.showScoreInfo();
        System.out.println("========================================");
        studentKim.showScoreInfo();

    }

}
