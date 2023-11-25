package com.kodilla.additionaltasks;

public class WeAreThePower {

    public static int aToThePowerOfB(int a, int b){
        int result = 0;
        if (a>=0 && b>=0){
            result=1;
            for (int i =0; i<b;i++){
                result=result*a;
            }
        } else {
            System.out.println("the substituent and exponent must be integers and non-negative");
        }
        return result;
    }

    public static void main(String[] args) {
        int zeroToFour = WeAreThePower.aToThePowerOfB(0,4);
        System.out.println("0 to the power of 4: " +zeroToFour);
        int twoToZero = WeAreThePower.aToThePowerOfB(2,0);
        System.out.println("2 to the power of 0: " +twoToZero);
        int threeToOne = WeAreThePower.aToThePowerOfB(3,1);
        System.out.println("3 to the power of 1: " +threeToOne);
    }
}
