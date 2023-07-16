// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/cc5-02-add-one

import java.io.*;
import java.util.*;

public class array_30 {
    public static int[] addOne(int[] arr, int n) {
        int idx = n-1;
        while(idx >= 0 && arr[idx] == 9) {
            arr[idx] = 0;
            idx--;
        }
        if(idx == -1) {
            int[] res = new int[n+1];
            res[0] = 1;
            return res;
        }
        arr[idx]++;
        return arr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int[] res = addOne(arr, n);
        
        for(int ele: res) {
            System.out.print(ele + " ");
        }
    }
}