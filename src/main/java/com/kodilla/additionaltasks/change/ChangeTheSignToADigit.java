package com.kodilla.additionaltasks.change;

public class ChangeTheSignToADigit {

    public static int changeToADigit(String string) throws IncorrectCharacterException {
        if (string.length() == 1) {
            char ch = string.charAt(0);
            if (Character.isDigit(ch)) {
                return Character.getNumericValue(ch);
            } else {
                throw new IncorrectCharacterException("Incorrect character");
            }
        } else {
            throw new IncorrectCharacterException("Incorrect character");
        }
    }

    public static void main(String[] args) {

        try {
            int result = changeToADigit("8");
            System.out.println(result);
        } catch (IncorrectCharacterException e) {
            System.out.println(e.getMessage());
        }
    }

}
