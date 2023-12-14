package com.kodilla.additionaltasks;

import javax.print.attribute.standard.MediaSize;

public class WeAreThePower {

    public static double aToThePowerOfB(double a, double b) {
        double result=0 ;
        if (a>=0 && b>=0 && a==(int)a && b==(int)b) {
            result=1;
            for (int i =0; i<b;i++) {
                result=result*a;
            }
        } else {
            System.out.println("The substituent and exponent must be integers and non-negative");
        }
        return result;
    }

    public static void main(String[] args) {
        double zeroToFour = WeAreThePower.aToThePowerOfB(0,4);
        System.out.println("0 to the power of 4: " +zeroToFour);
        double twoToZero = WeAreThePower.aToThePowerOfB(2,0);
        System.out.println("2 to the power of 0: " +twoToZero);
        double threeToOne = WeAreThePower.aToThePowerOfB(3,1);
        System.out.println("3 to the power of 1: " +threeToOne);
    }
}
