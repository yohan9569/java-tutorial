package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter // Class 단위
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false) // -> super=Member(1, yohan)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {

    @ToString.Include(name = "memberId")
    private Integer id;
    @ToString.Include(rank = -1)
    private String name;
    private int age;
    private String email;

    public boolean equals(Member member) {
        return this.hashCode() == member.hashCode();
    }

    @Override
    public int hashCode() {
        int hash = 7; // 소수를 활용
        hash = 31 * hash + (id == null ? 0 : id.hashCode());
        hash = 31 * hash + (name == null ? 0 : name.hashCode());
        hash = 31 * hash + (int) age;
        hash = 31 * hash + (email == null ? 0 : email.hashCode());
        return hash;
    }
}
