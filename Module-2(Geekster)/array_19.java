// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/first-non-matching-value-from-end/problem

import java.io.*;
import java.util.*;

public class array_19 {
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i <n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] arr2 = new int[n];
        for(int i = 0; i <n; i++) {
            arr2[i] = in.nextInt();
        }
        
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] != arr2[i]) {
                System.out.println(i);
                return;
            }
        }
        
        System.out.println(-1);
    }
}