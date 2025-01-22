package com.example.demo.member;

public class Member {

    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    // 부분 초기화 생성자
    public Member(String name) {
        this.name = name;
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
