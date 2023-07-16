//https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/product-of-array-except-that-idx

import java.io.*;
import java.util.*;

public class array_22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] left = new int[n];
        left[0] = 1;
        for(int i = 1; i < n; i++) {
            left[i] = arr[i-1] * left[i-1];
        }
        
        int[] right = new int[n];
        right[n-1] = 1;
        for(int i = n-2; i >= 0; i--) {
            right[i] = right[i+1] * arr[i+1];
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(left[i] * right[i]);
        }
        
        
    }
}