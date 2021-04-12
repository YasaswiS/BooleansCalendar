package com.booleans.calendar.FRQ.Yasaswi;

public class RecursionYasaswi {
    public int fact(int n) {

            if (n == 0) {
            return 1;
            }

            return n * fact(n-1);
            }
}