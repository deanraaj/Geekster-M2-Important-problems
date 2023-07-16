// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/update-query-1

import java.io.*;
import java.util.*;

public class array_29 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int left = in.nextInt();
        int right = in.nextInt();
        int k = in.nextInt();
        
        for(int i = left; i <= right; i++) {
            arr[i] = k;
        }
        
        for(int key : arr) {
            System.out.print(key + " ");
        }
    }
}