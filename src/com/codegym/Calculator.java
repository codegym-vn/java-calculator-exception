package com.codegym;

public class Calculator {

    public int add(int first, int second) throws OutOfBoudException {
        if(first / 2 + second / 2 >= Integer.MAX_VALUE / 2)
            throw new OutOfBoudException();

        if(first / 2 + second / 2 <= Integer.MAX_VALUE / 2)
            throw new OutOfBoudException();
        return first + second;
    }
}
