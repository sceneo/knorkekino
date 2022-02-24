package com.prodyna.knorkekino.service.exception;

public class ProgramNotFoundException extends RuntimeException {

    public ProgramNotFoundException(String message) {
        throw new RuntimeException(message);
    }
}
