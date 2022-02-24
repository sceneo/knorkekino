package com.prodyna.knorkekino.service.exception;

public class MovieNotFoundException extends RuntimeException {

    public MovieNotFoundException(String message) {
        throw new RuntimeException(message);
    }
}
