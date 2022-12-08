package com.codestates.section2week4.member;

public class Member {
    private Long memberId;
    private String email;
    private String name;
    private String phone;

    // 생성자
    public Member(Long memberId, String email, String name, String phone) {
        this.memberId = memberId;
        this.email = email;
        this.name = name;
        this.phone = phone;
    }
}
