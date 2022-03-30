package com.example.simpldevtools.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.UUID;

@RestControllerAdvice
public class PersonControllerAdvice {

    @ExceptionHandler(PersonNotFoundException.class)
    public ResponseEntity<AppError> handleException(PersonNotFoundException exception){
        AppError error = new AppError(UUID.randomUUID().toString(),
                exception.getMessage(),
                HttpStatus.INTERNAL_SERVER_ERROR);
        return new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
