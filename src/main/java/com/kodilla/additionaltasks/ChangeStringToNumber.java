package com.kodilla.additionaltasks;

public class ChangeStringToNumber {

    public static int changeToNumber(String input) {
        return Integer.parseInt(input);
    }


    public static void main(String[] args) {
        try {
            System.out.println(changeToNumber("00053478654"));
        } catch (NumberFormatException e) {
            System.out.println("Input do not contains only digits");
        }
    }

}
