package com.kodilla.additionaltasks;

import java.time.LocalTime;

public class CountToBillion {

    public static void main(String[] args) {
        int n = 0;
        System.out.println(LocalTime.now());
        long start = System.currentTimeMillis();
        while(n < 1000000000) {
            n++;
            if (n%10000==0) {
                System.out.println(n);
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(LocalTime.now());
        System.out.println(end - start);

    }

}
