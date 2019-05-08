package com.codegym;

public class Main {

    public static void main(String[] args) {
	    Calculator calculator = new Calculator();
        try {
            int sum = calculator.add(Integer.MAX_VALUE - 1, 1);
            System.out.println(sum);
        } catch (OutOfBoudException e) {
            System.out.println(e.getMessage());
        }
    }
}
