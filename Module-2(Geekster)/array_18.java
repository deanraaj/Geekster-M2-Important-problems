// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-all-composite-number-of-array

import java.io.*;
import java.util.*;

public class array_18 {
    
    public static boolean composite(int n) {
        if(n == 1 || n==2) return false;
        for(int i = 2; i < n; i++) {
            if(n%i == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            if(composite(arr[i])) {
                System.out.println(arr[i] + " ");
            }
        }
    }
}