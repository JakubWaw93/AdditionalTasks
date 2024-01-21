package com.kodilla.additionaltasks;

public class MateOfMaxAndMin {

    public static int mateOfMax(int [] array) {
        int max = -999999999;
        int mateOfMax = -999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] > mateOfMax && array[i] < max) {
                mateOfMax = array[i];
            }
        }
        return mateOfMax;
    }

    public static int mateOfMin(int [] array) {
        int min = 999999999;
        int mateOfMin = 999999999;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < mateOfMin && array[i] > min) {
                mateOfMin = array[i];
            }
        }
        return mateOfMin;
    }

    public static void main(String[] args) {
        int [] myArray = new int[] {3,1,1,5,6,7,9,15,3,4,7,10};

        int mateOfMax = mateOfMax(myArray);
        int mateOfMin = mateOfMin(myArray);

        System.out.println(mateOfMax);
        System.out.println(mateOfMin);
    }

}
