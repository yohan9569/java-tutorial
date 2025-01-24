package com.example.demo;

import com.example.demo.member.Member;
import java.util.Objects;

public class DemoApplication {

    public static void main(String[] args) {
        String requestName = "zohan";

        // (1) 빌더 정의
        // (2) 필드 설정 : (2.1) 공통 부분
        Member.MemberBuilder builder = Member.builder()
            .age(30)
            .email("common@example.com");
        // (2) 필드 설정 : (2.2) 다른 부분은 따로 설정
        if (requestName.equals("yohan")) {
            builder
                .id(1)
                .name(requestName);
        } else if (requestName.equals("zohan")) {
            builder
                .id(2)
                .name("zohan");
        }
        // 객체 생성
        Member yohan = builder.build();

        System.out.println("---");
        System.out.println(yohan);
        System.out.println(yohan.getName());
    }

}
