package com.example.demo.member;

public class Member {

    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    // dto로 초기화 생성자
    public Member(MemberRequestDto dto) {
        this.name = dto.getName();
        this.email = dto.getEmail();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
