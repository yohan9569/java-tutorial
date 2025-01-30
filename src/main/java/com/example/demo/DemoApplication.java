package com.example.demo;

import com.example.demo.member.Member;
import java.util.List;
import java.util.Objects;

public class DemoApplication {

    public static void main(String[] args) {
        Member yohan = Member.builder()
            .id(1)
            .name("yohan")
            //.favorites(List.of("Singing", "BoardGame")) // 한번에 넣을 때 복수형
            .favorite("Movie")                            // 하나씩 넣을 때 단수형 -> Singular
            .favorite("Drum")
            .build();

        System.out.println("---");
        System.out.println(yohan);          // Member(id=1, name=yohan, age=10, email=default, favorites=[Movie, Drum])
        System.out.println(yohan.getName());// yohan
    }
}
