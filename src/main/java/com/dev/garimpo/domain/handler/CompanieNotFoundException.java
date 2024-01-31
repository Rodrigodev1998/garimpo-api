package com.dev.garimpo.domain.handler;

public class CompanieNotFoundException extends RuntimeException {
    public CompanieNotFoundException(String message) {
        super(message);
    }
}
