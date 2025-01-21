package com.example.demo;

import com.example.demo.member.Administrator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Administrator yohan = new Administrator(1, "yohan", 10, "yohan@example.com", "DEVELOPER");
        Administrator yohan2 = new Administrator(11, "yohan2", 16, "yohan@other.com", "DEVELOPER");

        System.out.println("---");
        System.out.println(yohan);                // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan2);               // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan == yohan2);      // false
        System.out.println(yohan.equals(yohan2)); // true : Administrator 재정의 했지만, 자식만의 필드들만 계산됨
    }

}
