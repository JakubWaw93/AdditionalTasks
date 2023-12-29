package com.kodilla.additionaltasks;

public class FibonaccisCravings {

    public static int fibonacciSequence(int a) {
        int x = 0;
        int y = 1;
        if (a > 0) {
            for (int i = 1; i < a; i++) {
                y = x + y;
                x = y - x;
            }

        } else {
            System.out.println("Choose element of th sequence, it begins with '1'.");
        }
        return x;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciSequence(9));
    }

}
