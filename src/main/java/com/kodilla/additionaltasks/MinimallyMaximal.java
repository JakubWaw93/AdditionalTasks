package com.kodilla.additionaltasks;

public class MinimallyMaximal {

    public static int minimal(int [] array) {
        int min = 999999999;
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int maximal(int [] array) {
        int max = -999999999;
        for (int i = 0; i < array.length; i++ ) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int [] exampleNumbers = {3,1,5,6,7,9,15,3,4,7,10};

        int min = MinimallyMaximal.minimal(exampleNumbers);
        int max = MinimallyMaximal.maximal(exampleNumbers);
        System.out.println("Minimal value equals: " + min + ",\n" +
                "Maximal value equals: " + max);
    }

}
