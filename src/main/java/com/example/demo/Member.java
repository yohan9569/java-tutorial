package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Getter // Class 단위
@ToString(of = {"id", "name"}) // 이전 스타일의 'exclude/of' 매개변수는 새 스타일의 @Include / @Exclude 주석과 함께 사용할 수 없음.
@AllArgsConstructor(access = AccessLevel.PUBLIC) // AccessLevel: Sets the access level of the constructor.
public class Member {

    private Integer id;
    private String name;
    @Setter // 필드 단위
    private int age;
    @Setter(AccessLevel.PRIVATE) // 접근제어자를 Private 로 변경
    private String email;

//  이렇게 안 해도 된다.
//  public Member(Integer id, String name, int age, String email) {
//      this.id = id;
//      this.name = name;
//      this.age = age;
//      this.email = email;
//  }
}
