package com.example.demo;

import com.example.demo.member.Member;
import java.util.Objects;

public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = Member.builder()
            .id(1)
            .name("yohan")
            .build();

        System.out.println("---");
        System.out.println(yohan);              // Member(id=1, name=yohan, age=10, email=default)
        System.out.println(yohan.getName());    // yohan
    }
}
