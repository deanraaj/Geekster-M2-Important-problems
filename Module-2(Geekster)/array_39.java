// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/sort-array-in-decreasing-order-using-custom-sort/

import java.io.*;
import java.util.*;

public class array_39 {
    public static class myComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return b-a;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        Arrays.sort(arr,new myComparator());
        
        
        for(Integer ele : arr) System.out.print(ele + " ");
    }
}