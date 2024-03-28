package com.kodilla.additionaltasks;

public class ConvertDecimalToHexadecimal {

    public static String decimalToHexadecimal(int decimal) {
        // Hexadecimal digits
        char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7',
                '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

        // Check if the decimal number is zero
        if (decimal == 0) {
            return "0";
        }

        StringBuilder hexBuilder = new StringBuilder();

        // Convert decimal to hexadecimal
        while (decimal >= 1) {
            int remainder = decimal % 16;
            hexBuilder.insert(0, hexDigits[remainder]); // Insert the remainder at the beginning
            decimal /= 16; // Divide the decimal number by 16
        }

        return hexBuilder.toString();
    }

    public static void main(String[] args) {
        int decimal = 16; // Example decimal number

        // Convert decimal to hexadecimal
        String hexadecimal = decimalToHexadecimal(decimal);

        // Print the result
        System.out.println("Decimal " + decimal + " is equivalent to hexadecimal " + hexadecimal);
    }
}
