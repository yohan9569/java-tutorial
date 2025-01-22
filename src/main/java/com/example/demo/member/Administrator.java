package com.example.demo.member;

import java.time.LocalDate;

public class Administrator extends Member {

    private final String role;
    private final LocalDate allocatedAt;

    public Administrator(String name, String email, String role) {
        this.name = name;
        this.email = email;
        this.role = role;
        this.allocatedAt = LocalDate.now();
    }

    public String toString() {
        return String.format(
            "Member(id=%s, name=%s, age=%s, email=%s, role=%s, allocated=%s)",
            this.id, this.name, this.age, this.email, this.role, this.allocatedAt
        );
    }

    public String getRole() {
        return role;
    }
}
