package com.booleans.calendar.FRQ.Neil;

public class RecursionNeil {
    public int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }
    public static void main(String[] args) {
        RecursionNeil test = new RecursionNeil();

        System.out.println(test.fact(3));
    }
}
