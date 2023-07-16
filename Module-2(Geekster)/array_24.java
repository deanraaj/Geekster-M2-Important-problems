// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-sum-of-array-except-that-idx/

import java.io.*;
import java.util.*;

public class array_24 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int sum = 0;
        
        for(int ele : arr) {
            sum += ele;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(sum - arr[i]);
        }
    }
}