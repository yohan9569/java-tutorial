package com.example.demo;

import com.example.demo.member.Administrator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Administrator yohan = new Administrator(1, "yohan", 10, "yohan@example.com", "DEVELOPER");
        Administrator yohan2 = new Administrator(1, "yohan", 16, "yohan@other.com", "ANALYST");

        System.out.println("---");
        System.out.println(yohan);                // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan2);               // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan == yohan2);      // false
        System.out.println(yohan.equals(yohan2)); // true : Administrator 에서 재정의 안 돼서, Member의 equals 사용
    }

}
