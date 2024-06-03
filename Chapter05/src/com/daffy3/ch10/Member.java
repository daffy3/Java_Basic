package com.daffy3.ch10;

public class Member implements Comparable<Member> {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName) {
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    // ====================================================================================================

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Member member) {

            return this.memberId == member.memberId;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId;
    }

    @Override
    public String toString() {
        return memberName + " 회원님의 아이디는 " + memberId + "입니다.";
    }

    @Override
    public int compareTo(Member member) {
        // 반환 값은 Int 인데,
        // 같으면 0을 반환
        // this와 넘어온 args와 비교해서 더 큰 1을 반환
        // 작으면 음수를 반환
        if (this.memberId > member.memberId) return 1;
        else if (this.memberId < member.memberId) return -1;
        else return 0;
    }
}
