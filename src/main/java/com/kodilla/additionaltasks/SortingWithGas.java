package com.kodilla.additionaltasks;

import java.util.Objects;

public class SortingWithGas {

    public static String bubbleSorting(String numbers) {
        for (int n = 0; n < numbers.length()-1; n++) {
            for (int i = 0; i < numbers.length() - 1; i++) {
                if (Integer.parseInt(String.valueOf(numbers.charAt(i)))
                        > Integer.parseInt(String.valueOf(numbers.charAt(i + 1)))) {
                    StringBuilder sb = new StringBuilder();
                    sb = sb.append(numbers, 0, i).append(numbers.charAt(i + 1))
                            .append(numbers.charAt(i)).append(numbers.substring(i + 2));
                    numbers = sb.toString();
                }
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        try {
            String result = bubbleSorting("21854241");
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Input contains char other than numbers");
        }
    }
}
