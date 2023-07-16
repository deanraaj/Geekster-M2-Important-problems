// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/merge-two-sorted-arrays-6-3

import java.io.*;
import java.util.*;

public class array_42 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        
        int n2 = in.nextInt();
        int[] arr2 = new int[n2];
        for(int i = 0; i < n2; i++) {
            arr2[i] = in.nextInt();
        }
        
        int idx1 = 0, idx2 = 0;
        int idx = 0;
        int[] res = new int[n1+n2];
        while(idx1 < n1 && idx2 < n2) {
            if(arr1[idx1] < arr2[idx2]) {
                res[idx] = arr1[idx1];
                idx1++;
                idx++;
            } else {
                res[idx] = arr2[idx2];
                idx2++;
                idx++;
            }
        }
        
        while(idx1 < n1) {
            res[idx] = arr1[idx1];
            idx1++;
            idx++;
        }
        
        while(idx2 < n2) {
            res[idx] = arr2[idx2];
            idx2++;
            idx++;
        }
        
        for(int ele : res) {
            System.out.print(ele + " ");
        }
    }
}