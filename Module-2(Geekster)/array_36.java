// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/store-maximum

import java.io.*;
import java.util.*;

public class array_36 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] left = new int[n];
        left[0] = arr[0];
        for(int i = 1; i < n; i++) {
            left[i] = Math.max(arr[i], left[i-1]);
        }
        
        int[] right = new int[n];
        right[n-1] = arr[n-1];
        for(int i = n-2; i >= 0; i--) {
            right[i] = Math.max(arr[i], right[i+1]);
        }
        int Q= 0;
        for(int i = 0; i < n; i++) {
            int q = Math.min(left[i], right[i]);
            int qq = q-arr[i];
            Q = Q + qq;
        }
        System.out.println(Q);
        
    }
}