package com.example.oop_and_solid;

public class Member {

    private String memberName;
    private int memberId;
    private static int idCount = 0;

    public Member(String memberName) {

        this.memberName = memberName;
        memberId = ++idCount;
    }

    public int getMemberId() {
        return this.memberId;
    }

    public String getMemberName() {

        return this.memberName;
    }

    public void setMemberName(String memberName) {

        this.memberName = memberName;

    }

}
