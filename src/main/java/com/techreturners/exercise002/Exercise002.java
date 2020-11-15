package com.techreturners.exercise002;

public class Exercise002 {

    // The clock shows 'h' hours, 'm' minutes and 's' seconds after midnight.
    // Your task is to make the 'past' function return time past midnight converted to milliseconds.

    public int past(int h, int m, int s) {
        // Your code here!
        // 1s = 1000 milliseconds
        // 1m = 60s = 60 * 1000 milliseconds
        // 1h = 60*60s = 3600 * 1000 milliseconds
        int res;
        res = (s + m * 60 + h * 3600) * 1000;
        return res;
    }
}
