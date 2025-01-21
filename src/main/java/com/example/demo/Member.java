package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter // Class 단위
@Setter
@ToString(onlyExplicitlyIncluded = true, includeFieldNames = false) // -> super=Member(1, yohan)
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Member {

    @ToString.Include(name = "memberId")
    @EqualsAndHashCode.Include
    private Integer id;
    @ToString.Include(rank = -1)
    @EqualsAndHashCode.Include
    private String name;
    private int age;
    private String email;
}
