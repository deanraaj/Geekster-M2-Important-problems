// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/maximum-product-subarray-2/

import java.io.*;
import java.util.*;

public class array_48 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < n;i++) {
            int p = 1;
            for(int j = i; j < n; j++) {
                p = p * arr[j];
                max = Math.max(p, max);
            }
        }
        
        System.out.print(max);
    }
    
   
}