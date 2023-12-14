package com.kodilla.additionaltasks;

public class WeAreThePower2 {

    public static long thePower(long a) {

        if (a > 0) {
            long result = 1;
            for (int i = 1; i <= a; i++) {
                result = result * i;
            }
            return result;
        } else if (a == 0) {
            return 1;
        } else {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {

        try {
            long exampleNumber = 0;
            System.out.println(WeAreThePower2.thePower(exampleNumber));
        } catch (ArithmeticException e) {
            System.out.println("You cannot use negative numbers");
        }
    }
}
