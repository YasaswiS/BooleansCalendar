package com.booleans.calendar.FRQ.Neil;
import java.util.stream.LongStream;
import java.time.Duration;
import java.time.Instant;

public class RecursionNeil {

    public int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n * fact(n-1);
        }
    }

    public int loop(int n){
        int result = 1;
        for (int i = n; i>0; i--){
            result = i*result;
        }
        return result;
    }


    public static void main(String[] args) {
        RecursionNeil test = new RecursionNeil();

        System.out.println(test.fact(3));
        }
    }

