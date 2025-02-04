package com.example.demo;

import com.example.demo.dto.MemberCreateRequestDto;
import com.example.demo.member.Member;

public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = new Member(1, "yohan"); //RequiredArgsConstructor: final 필드는 필수

        System.out.println("---");
        System.out.println(yohan);
        //yohan.setId(2);                                // final 변수는 초기화 이후 변경 불가.
        //yohan.setName("zohan");
        yohan.setAge(25);
        yohan.setEmail("email@mail.com");
    }
}
