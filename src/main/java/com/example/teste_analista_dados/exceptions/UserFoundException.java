package com.example.teste_analista_dados.exceptions;

public class UserFoundException extends RuntimeException {

    public UserFoundException() {
        super("User already exists");
    }
}
