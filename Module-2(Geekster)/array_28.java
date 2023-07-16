// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/solve-array

import java.io.*;
import java.util.*;

public class array_28 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] idx = new int[n];
        for(int i = 0; i < n; i++) {
            idx[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[idx[i]] + " ");
        }
    }
}