package com.daffy3.ch11;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private final HashMap<Integer, Member> hashMap;

    public MemberHashMap() {
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) {
        hashMap.put(member.getMemberId(), member); // put 메서드를 통해 add 한다.
    }

    public boolean removeMember(int memberId) {
        hashMap.remove(memberId);
        System.out.println("No Element");
        return false;
    }

    public void showAllMember() {
        Iterator<Integer> ir = hashMap.keySet().iterator();

        while (ir.hasNext()) {
            int key = ir.next();
            Member member = hashMap.get(key);

            System.out.println(member);
        }
    }
}
