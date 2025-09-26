package com.it.exception;

/**
 * 自定义注册异常
 */
public class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
