// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/maximum-of-array

import java.io.*;
import java.util.*;

public class array_21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        System.out.println(max);
        
    }
}