// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/gkstr41-peak-elements

import java.io.*;
import java.util.*;

public class array_44 {
    public static void peakIdx(int[] arr, int n) {
        for(int i = 1; i < n-1; i++) {
            if(arr[i-1] < arr[i] && arr[i] > arr[i+1]) {
                System.out.print(arr[i] + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        peakIdx(arr, n);
    }
}