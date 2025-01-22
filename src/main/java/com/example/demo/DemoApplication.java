package com.example.demo;

import com.example.demo.member.Member;
import com.example.demo.member.MemberRequestDto;

public class DemoApplication {

    public static void main(String[] args) {
        MemberRequestDto dto = new MemberRequestDto("yohan", "yohan@example.com");
        Member yohan = new Member(dto);

        yohan.setEmail("yohan@example.com");

        System.out.println("---");
        System.out.println(yohan);
        System.out.println(yohan.getName());
    }
}
