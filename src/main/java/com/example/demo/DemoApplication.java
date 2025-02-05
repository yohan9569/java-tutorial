package com.example.demo;

import java.sql.SQLException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
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
            log.error(String.format("데이터베이스 계정 불일치 - username: %s, password: %s", id, password));
            // 15:07:59.115 [main] ERROR com.example.demo.DemoApplication -- 데이터베이스 계정 불일치 - username: edmin, password: 4321
            // Stacktrace 가 없어서 추적 불가
        }
    }

    public static void main(String[] args) {
        connect("admin", "1234"); // - Database is connected successfully.
        connect("edmin", "4321"); // Exception in thread "main" java.lang.RuntimeException: 데이터베이스 접속 실패 at ~ at ~
    }
}
