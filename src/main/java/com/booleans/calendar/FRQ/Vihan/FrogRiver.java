package com.booleans.calendar.FRQ.Vihan;

import java.time.Duration;
import java.time.Instant;


public class FrogRiver {
    public long timeElapsed;
    int paths;

    public FrogRiver(int n) {
        long start = System.nanoTime();
        paths = PathsToNthStone(n);

        timeElapsed = System.nanoTime()-start;
    }
    public int PathsToNthStone(int n) {
        if (n == 1 || n==0) {
            return 1;
        } else {
            return PathsToNthStone(n-1)+PathsToNthStone(n-2);
        }

    }

    public int getPaths() {
        return this.paths;
    }
    public double getTimeElapsed() {
        return this.timeElapsed;
    }

}
