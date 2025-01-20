package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = new Member(1, "yohan", 30, "yohan9569@gmail.com");

        System.out.println(yohan);            // com.example.demo.Member@527740a2 객체
        System.out.println(yohan.toString()); // com.example.demo.Member@527740a2 객체
    }

}
