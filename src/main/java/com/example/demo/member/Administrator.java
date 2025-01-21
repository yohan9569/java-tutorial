package com.example.demo.member;

import com.example.demo.Member;
import java.time.LocalDate;
import lombok.EqualsAndHashCode;
import lombok.ToString;

// @AllArgsConstructor // Lombok needs a default constructor in the base class
@ToString(callSuper = true)
@EqualsAndHashCode
public class Administrator extends Member {

    private String role;
    private LocalDate allocatedAt;

    public Administrator(Integer id, String name, int age, String email, String role) {
        super(id, name, age, email);
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

//    @Override // 생략 가능 // 재정의 안하면, 상위 클래스 버전 출력. Member(memberId=1, name=yohan)
//    public String toString() {
//        return String.format(
//            "Administrator(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
//            this.getId(), this.getName(), this.getAge(), this.getEmail(), this.role, this.allocatedAt
//        );
//    }
}
