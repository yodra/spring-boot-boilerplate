package com.springboilerplate.exceptions;

public class InvalidPasswordResetToken extends RuntimeException {

    public InvalidPasswordResetToken(String message) {
        super(message);
    }
}
