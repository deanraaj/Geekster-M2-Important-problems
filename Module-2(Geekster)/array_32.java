// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-pair

import java.io.*;
import java.util.*;

public class array_32 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                System.out.println(arr[i] + " " + arr[j]);
            }
        }
        
    }
}