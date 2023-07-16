// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/majority-element-10-1

import java.io.*;
import java.util.*;

public class array_45 {
    public static int majority(int[] arr, int n) {
        int c = 1;
        int majority = arr[0];
        for(int i = 1; i < n; i++) {
            if(c==0) {
                majority = arr[i];
            }
            c = arr[i] == majority ? c + 1 : c-1;
        }
        if(c==0) return -1;
        return majority;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        if(-1 == majority(arr, n)) {
            System.out.println("NO MAJORITY ELEMENT");
        } else {
            System.out.println(majority(arr, n));
        }
    }
}