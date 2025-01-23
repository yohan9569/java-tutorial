package com.example.demo;

import com.example.demo.member.Member;
import java.util.ArrayList;
import java.util.List;

public class DemoApplication {

    public static void main(String[] args) {
        List<Member> list = new ArrayList<>();
        Member a = new Member(1, "a", 3, "mail");
        Member b = new Member(2, "d", 4, "mail");
        Member c = new Member(3, "b", 1, "mail");
        Member d = new Member(4, "c", 2, "mail");

        list.add(a);
        list.add(b);
        list.add(c);
        list.add(d);

        //list.sort((o1, o2) -> Member.compareTo(o1, o2)); //Lambda can be replaced with method reference
        list.sort(Member::compareTo);
        // 메서드 참조: 람다에서 한 메서드 호출밖에 안 할 때, 불필요한 파라미터 제거. 클래스::메서드 or 참조변수::메서드.
        list.forEach(System.out::println);
    }
}
