package com.booleans.calendar.FRQ.Vihan;

import java.time.Duration;
import java.time.Instant;


public class FrogRiver {
    Duration timeElapsed;
    int paths;

    public FrogRiver(int n) {
        Instant start = Instant.now();
        paths = PathsToNthStone(n);
        Instant end = Instant.now();

        timeElapsed = Duration.between(start,end);
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
        return this.timeElapsed.getNano();
    }

}
