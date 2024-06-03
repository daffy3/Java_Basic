package com.daffy3.ch11;

import java.util.HashMap;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap = new MemberHashMap();
        Member memberLee = new Member(1002, "이순신");
        Member memberKim = new Member(1001, "김유신");
        Member memberKang = new Member(1004, "강감찬");
        Member memberHong = new Member(1003, "홍길동");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);
        memberHashMap.addMember(memberHong);

        memberHashMap.showAllMember();

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap); // {1001=Kim, 1002=Lee, 1003=Park, 1004=Hong}

    }

}
