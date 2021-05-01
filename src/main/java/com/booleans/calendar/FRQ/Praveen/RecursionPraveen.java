package com.booleans.calendar.FRQ.Praveen;

import java.time.Duration;
import java.time.Instant;

public class RecursionPraveen {
    double timeElapsed;

    public RecursionPraveen(){
        long start = System.nanoTime();
        timeElapsed = System.nanoTime()-start;
    }
    

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

    public double getTimeElapsed() {
        return this.timeElapsed;
    }
}

