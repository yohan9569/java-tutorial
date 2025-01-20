package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

// Sets the access level of the constructor.
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {

    private Integer id;
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
