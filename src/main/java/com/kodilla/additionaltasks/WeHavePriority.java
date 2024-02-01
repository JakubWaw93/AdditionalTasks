package com.kodilla.additionaltasks;

public class WeHavePriority {

    public static boolean isItPrime(int number) {
        int dividerCounter = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                dividerCounter++;
            }
        }
        if (dividerCounter > 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println(isItPrime(69));
    }

}
