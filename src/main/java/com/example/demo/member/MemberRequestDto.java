package com.example.demo.member;

public class MemberRequestDto {

    private String name;
    private String email;

    public MemberRequestDto(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
