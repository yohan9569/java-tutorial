package com.example.demo;

import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
    static void connect(String id, String password) {
        try {
            if (id.equals("admin") && password.equals("1234")) {
                System.out.println("- Database is connected successfully.");
            } else {
                //throw new RuntimeException("데이터베이스 접속 실패");
                throw new SQLException("데이터베이스 접속 실패");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        connect("admin", "1234"); // - Database is connected successfully.
        connect("edmin", "4321"); // Exception in thread "main" java.lang.RuntimeException: 데이터베이스 접속 실패 at ~ at ~
    }
}
