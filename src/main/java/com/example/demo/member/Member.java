package com.example.demo.member;

import lombok.Builder;
import lombok.Builder.Default;

@Builder
public class Member {

    protected Integer id;
    protected String name;
    @Builder.Default
    protected int age = 10;
    @Default // 앞에 Builder. 안 붙여도 동작한다.
    protected String email = "default";


    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s)", id, name, age, email);
    }

    public String getName() {
        return name;
    }
}
