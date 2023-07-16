// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-first-non-matching-number

import java.io.*;
import java.util.*;

public class array_16 {
    
    public static int checkEle(int[] arr, int n, int[] arr1) {
        
        for(int i = 0; i < n; i++) {
            if(arr[i] != arr1[i]) return i;    
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] arr1 = new int[n];
        for(int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        
        
        
        System.out.println(checkEle(arr, n, arr1));
    }
}