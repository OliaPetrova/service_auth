package com.example.servise_auth.exceptionsAndHandlers;

public class UnauthorizedUser extends RuntimeException {
    public UnauthorizedUser(String msg) {
        super(msg);
    }
}