package com.daffy3.ch10;

import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {
//        TreeSet<String> set = new TreeSet<String>();
//
//        set.add("홍길동");
//        set.add("이순신");
//        set.add("강감찬");
//
//        System.out.println(set); // [강감찬, 이순신, 홍길동]

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKang = new Member(1003, "강감찬");
        Member memberKim = new Member(1002, "김유신");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);

        memberTreeSet.showAllMember();
    }

}
