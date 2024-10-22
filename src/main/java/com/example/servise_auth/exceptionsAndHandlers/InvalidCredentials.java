package com.example.servise_auth.exceptionsAndHandlers;

public class InvalidCredentials extends RuntimeException {
    public InvalidCredentials(String msg) {
        super(msg);
    }
}