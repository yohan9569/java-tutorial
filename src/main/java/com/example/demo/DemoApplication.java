package com.example.demo;

import com.example.demo.dto.MemberCreateRequestDto;
import com.example.demo.member.Member;

public class DemoApplication {

    public static void main(String[] args) {
        MemberCreateRequestDto requestDto = new MemberCreateRequestDto("yohan", "yohan@example.com");
        Member yohan = Member.from(requestDto);

        System.out.println("---");
        System.out.println(yohan);          // Member(id=null, name=yohan, age=0, email=yohan@example.com)
        System.out.println(yohan.getName());// yohan
    }
}
