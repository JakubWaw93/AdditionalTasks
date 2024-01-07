package com.kodilla.additionaltasks;

public class FibonaccisCravingsWithNoLoop {

    public static int fibonaccisSequence2(int n) {
        if (n <= 0) {
            System.out.println("Choose positive number");
            return -1;
        } else if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonaccisSequence2(n - 1) + fibonaccisSequence2(n - 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonaccisSequence2(51));
    }
}
