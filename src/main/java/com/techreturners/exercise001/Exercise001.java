package com.techreturners.exercise001;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!
   private static int partition(int[] arr, int l, int r) {
        int t = 0;
        int pi = r; // pivot index
        int p = arr[r];
        int i = l;
        boolean f= false;
        for (int j = l; j <  r; j ++) {
            if (arr[j]<p  ) {
                f = true;
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
            }
        }
        if (f || p < arr[l]) {
            t = arr[i];
            arr[i] = arr[r];
            arr[r] = t;
        }
        pi = i;
        return pi;
    }
    //QuickSort
    private static int QuickSort(int[] arr, int low, int hi){
        if (low < hi){
            int pi = partition(arr, low, hi);
            QuickSort(arr, low, pi - 1);
            QuickSort(arr, pi + 1, hi);
        }
        return 0;
    }

    public int singles(int [] arr){
        /*
        */
        int i = 0;
        int s = 0;
        QuickSort(arr, 0,arr.length - 1);
        while (i <=arr.length - 1) {
            if (i + 1 > arr.length -1) {
                if (arr[i] != arr[i-1]) {
                    s = s + arr[i];
                    i ++;
                }
            }
            else {
                if (arr[i] != arr[i+1]) {
                    s = s + arr[i];
                    i ++;
                }
                else {
                    i = i + 2;
                }
            }
        }
        return s;
 
    }
}
