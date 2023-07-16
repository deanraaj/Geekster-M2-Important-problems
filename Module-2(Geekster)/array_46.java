// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-subsets-1

import java.io.*;
import java.util.*;

public class array_46 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                for(int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
        }        
    }
}