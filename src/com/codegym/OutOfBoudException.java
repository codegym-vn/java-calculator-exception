package com.codegym;

public class OutOfBoudException extends Exception {

    public OutOfBoudException() {
        super("We can't handle large values");
    }
}
