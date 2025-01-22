package com.example.demo.member;

public class Member {

    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    // 전체 초기화 생성자
    public Member(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
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
