package com.example.demo;

import com.example.demo.member.Member;

public class DemoApplication {

    public static void main(String[] args) {
        //기존: Member yohan = new Member(1, "yohan", 30, "yohan@example.com");
        Member yohan = Member.builder()     // 설정값을 모아주는 MemberBuilder 객체 반환, 여기에 하나하나 설정 넣어 줌.
            .name("yohan")                  // 순서가 바껴도 된다.
            .id(1)
            .age(30)
            // .email("yohan@example.com")  // 없어도 된다. (null) 기본값으로 들어감.
            .build();                       // 자 이제 Member 만들어줘!

        System.out.println("---");
        System.out.println(yohan);
        System.out.println(yohan.getName());
    }
}
