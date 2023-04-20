package com.codestates.section2week4.Member;

public class Member {
    private Long memberId;
    private String email;
    private String name;
    private String phone;

    public Member(long memberId, String email, String name, String phone) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }

    public long getMemberId() {
        return memberId;
    }

    public void setMemberId(long memberId) {
        this.memberId = memberId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
