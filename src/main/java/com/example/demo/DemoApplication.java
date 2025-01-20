package com.example.demo;

import com.example.demo.member.Administrator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Administrator yohan = new Administrator(1, "yohan", "backend");

        System.out.println(yohan);            // com.example.demo.Member@527740a2 객체
        System.out.println(yohan.toString()); // com.example.demo.Member@527740a2 객체

        // yohan.setId(2);                    // 해당 필드는 setter 적용이 안 됨.
        yohan.setAge(31);
        // yohan.setEmail("yohan9569@naver.com");   // Private 로 바꾸어서 외부에서 호출 불가

        System.out.println(yohan.getId());    // @Getter 클래스 단위로 적용하여 모든 필드 조회 가능
        System.out.println(yohan.getName());
        System.out.println(yohan.getAge());
        System.out.println(yohan.getEmail());

    }

}
