package com.example.demo.member;

import lombok.Builder;

public class Member {

    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    @Builder
    public Member(Integer id, String name, int age, String email) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }

    public String getName() {
        return name;
    }
}
