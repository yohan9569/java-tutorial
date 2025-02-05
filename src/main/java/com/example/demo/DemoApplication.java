package com.example.demo;

import com.example.demo.exception.DatabaseException;
import com.example.demo.exception.IdException;
import com.example.demo.exception.PasswordException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.util.StringUtils;

@Slf4j
@SpringBootApplication
public class DemoApplication {
    static void connect(String id, String password) {
        if (!StringUtils.hasText(id)) {
            throw new IdException();
        }
        if (!StringUtils.hasText(password)) {
            throw new PasswordException();
        }
        if (!(id.equals("admin") && password.equals("1234"))) {
            throw new DatabaseException();
        }

        log.info("- Database is connected successfully.");
    }

    public static void main(String[] args) {
        try {
            connect(null, "9876");   // 유저가 존재하지 않는 아이디를 입력 중 /  데이터베이스 접속에 필요한 ID 입력은 필수입니다.
            connect("user", null);   // 유저가 잘못된 비밀번호를 입력 중 / 데이터베이스 접속에 필요한 Password 입력은 필수입니다.
            connect("user", "9876"); // 잘못된 유저 정보로인한 데이터베이스 접속 실패 / 데이터베이스 접속 실패
            connect("admin", "1234");// - Database is connected successfully.
        } catch (IdException e) {
            log.warn("유저가 존재하지 않는 아이디를 입력 중", e);
        } catch (PasswordException e) {
            log.warn("유저가 잘못된 비밀번호를 입력 중", e);
        } catch (DatabaseException e) {
            log.warn("잘못된 유저 정보로인한 데이터베이스 접속 실패", e);
        }
    }
}
