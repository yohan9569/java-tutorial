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
import lombok.Value;
import lombok.experimental.FieldDefaults;
import lombok.experimental.NonFinal;

/* @Value: Immutable classes made very easy. is the immutable variant of @Data;
In practice, @Value is shorthand for:
    final -> class 상속 불가
    @ToString
    @EqualsAndHashCode
    @AllArgsConstructor
    @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
    @Getter
다만 관련 메서드의 구현을 명시적으로 포함하면 일부가 생성되지 않고 경고가 표시되지 않습니다. -> 맘에 안 들면 커스텀해서 쓰기.
*/
@Value
@NonFinal // 상속(extends)을 위해서는 @NonFinal 통해 class 에게 자유를
// @Setter 필드에 @NonFinal 붙여서 setter 만들 수는 있다.
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
    // @NonFinal
    /*private*/ String email;
}
