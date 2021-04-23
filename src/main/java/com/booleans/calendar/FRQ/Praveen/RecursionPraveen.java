package com.booleans.calendar.FRQ.Praveen;

public class RecursionPraveen {
    public int fact(int n) {
            if (n == 0) {
            return 1;
            }
            else{
              return n * fact(n-1);
            }
            }

    public static void main(String[] args) {
        RecursionPraveen test = new RecursionPraveen();

        System.out.println(test.fact(3));
    }
}

