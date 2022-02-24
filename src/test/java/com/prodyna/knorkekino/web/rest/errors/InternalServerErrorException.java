package com.prodyna.knorkekino.web.rest.errors;

public class InternalServerErrorException extends RuntimeException {

    InternalServerErrorException() {
        throw new RuntimeException("You have been very very bad");
    }
}
