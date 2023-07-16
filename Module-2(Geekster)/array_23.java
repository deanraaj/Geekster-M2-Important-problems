// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/second-largest-in-array-2

import java.io.*;
import java.util.*;

public class array_23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            } 
            if(arr[i] > smax && arr[i] < max) {
                smax = arr[i];
            }
        }
        System.out.println(smax);
    }
}