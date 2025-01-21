package com.example.demo;

import com.example.demo.member.Administrator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        Administrator yohan = new Administrator(1, "yohan", 10, "yohan@example.com", "DEVELOPER");
        Administrator yohan2 = new Administrator(1, "yohan", 16, "yohan@other.com", "DEVELOPER");

        System.out.println("---");
        System.out.println(yohan);                // Member(1, yohan)
        System.out.println(yohan.getName());      // @Getter (@Data = 모든 "FINAL" 필드에 대해 Getter 생성)
        //yohan.setName("Caron");                 // @Setter (@Data = 모든 "NON-FINAL" 필드에 대해 Setter 생성) - 현재 makeFinal = true

        System.out.println("---");
        System.out.println(yohan2);               // Member(1, yohan)

        System.out.println("---");
        System.out.println(yohan == yohan2);      // false
        System.out.println(yohan.equals(yohan2)); // true : Administrator 재정의 후, 부모 필드 포함 전체 비교
        // - 부모 EqualsAndHashCode에서 설정한 값도 상속 (include 등)
    }

}
