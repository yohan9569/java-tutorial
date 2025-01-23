package com.example.demo.member;


import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@ToString
@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {

    Integer id;
    String name;
    int age;
    String email;

    public static int compareTo(Member o1, Member o2) {
        return o1.name.compareTo(o2.name);
    }
}