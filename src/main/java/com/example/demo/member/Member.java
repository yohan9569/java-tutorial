package com.example.demo.member;


import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Setter
@RequiredArgsConstructor
public class Member {
    protected final Integer id;
    protected final String name;
    protected int age;
    protected String email;
}
