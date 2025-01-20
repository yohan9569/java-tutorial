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

//  이렇게 안 해도 된다.
//  public Member(Integer id, String name, int age, String email) {
//      this.id = id;
//      this.name = name;
//      this.age = age;
//      this.email = email;
//  }
}
