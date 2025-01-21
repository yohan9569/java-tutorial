package com.example.demo;

import com.example.demo.member.Administrator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = new Member(1, "yohan", 10, "yohan@example.com");
        Member yohan2 = new Member(1, "yohan", 16, "yohan@other.com");

        System.out.println("---");
        System.out.println(yohan);                // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan2);               // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan == yohan2);      // false
        System.out.println(yohan.equals(yohan2)); // false -> true 로 바뀜.
    }

}
