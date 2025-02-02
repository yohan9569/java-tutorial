package com.example.demo.member;


import java.util.Objects;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Member {
    private static Member instance;
    protected Integer id;
    protected String name;
    protected int age;
    protected String email;

    public synchronized static Member getInstance() {
        if (Objects.isNull(instance)) {
            instance = new Member();
        }
        return instance;
    }
}
