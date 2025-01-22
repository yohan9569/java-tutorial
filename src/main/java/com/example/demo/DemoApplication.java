package com.example.demo;

import com.example.demo.member.Member;

public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = new Member();

        yohan.setName("yohan");
        yohan.setEmail("yohan@example.com");

        System.out.println("---");
        System.out.println(yohan);
        System.out.println(yohan.getName());
    }
}
