package com.example.demo.member;

import java.util.List;
import lombok.Builder;
import lombok.Builder.Default;
import lombok.Singular;

@Builder
public class Member {

    protected Integer id;
    protected String name;
    @Builder.Default
    protected int age = 10;
    @Default // 앞에 Builder. 안 붙여도 동작한다.
    protected String email = "default";
    @Singular
    protected List<String> favorites; // 복수 명칭 사용해야 함.

    public static class MemberBuilder {

        private int age;

        public MemberBuilder age(int age) {
            if (age < 19) {
                throw new RuntimeException("애들은 가라!");
            }
            this.age = age;
            return this;
        }
    }

    public String toString() {
        return String.format("Member(id=%s, name=%s, age=%s, email=%s, favorites=%s)", id, name, age, email, favorites);
    }

    public String getName() {
        return name;
    }
}
