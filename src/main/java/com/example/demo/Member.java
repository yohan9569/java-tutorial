package com.example.demo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

/* @Data
All together now: A shortcut for
    @ToString, @EqualsAndHashCode,
    @Getter on all fields, @Setter on all non-final fields,
    and @RequiredArgsConstructor!
*/
@Data // @ALL 이 아닌 @requiredargsconstructor 추가 -> final 붙어야 생성자에 주입 가능. // 아래 설정들도 유효, onlyExplicitlyIncluded 못 넣음 유의
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class Member {

    @ToString.Include(name = "memberId")
    @EqualsAndHashCode.Include
    /*private*/ Integer id;
    @ToString.Include(rank = -1)
    @EqualsAndHashCode.Include
    /*private*/ String name;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    /*private*/ int age;
    @EqualsAndHashCode.Exclude
    /*private*/ String email;
}
