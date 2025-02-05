package com.example.demo.exception;

public class IdException extends RuntimeException {
    public IdException() {
        super("데이터베이스 접속에 필요한 ID 입력은 필수입니다.");
    }
}
