package com.example.demo;

import com.example.demo.dto.MemberCreateRequestDto;
import com.example.demo.member.Member;

public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = Member.getInstance();
        Member zohan = Member.getInstance();

        System.out.println("---");
        System.out.println(yohan);          // Member@3108bc
        System.out.println(zohan);          // Member@3108bc
        System.out.println(yohan == zohan); // true
    }
}
