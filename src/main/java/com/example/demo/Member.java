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
        return this.id.equals(member.id)
            && this.name.equals(member.name)
            && this.age == member.age
            && this.email.equals(member.email);
    }
}
