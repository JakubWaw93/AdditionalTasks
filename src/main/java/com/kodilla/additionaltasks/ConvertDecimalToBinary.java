package com.kodilla.additionaltasks;

public class ConvertDecimalToBinary {

    public static String converter(int decimalNumber) {
        StringBuilder sb = new StringBuilder();

        while (decimalNumber >= 1) {
            int reminder = decimalNumber % 2;
            sb.insert(0, reminder);
            decimalNumber = decimalNumber / 2;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int decimalNumber = 6;
        String binaryNumber = converter(decimalNumber);
        System.out.println("The binary representation of " + decimalNumber + " is " + binaryNumber);
    }

}
