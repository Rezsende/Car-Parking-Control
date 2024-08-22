package com.example.cars.Configurations;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalErrorHandler {
    @ExceptionHandler(ResponseStatusException.class)
    public Object status(ResponseStatusException exception) {
        return null;
    }
}
