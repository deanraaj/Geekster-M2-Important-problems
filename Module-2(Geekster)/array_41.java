// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/sort-array-by-parity-2-1

import java.io.*;
import java.util.*;

public class array_41 {
    public static class myComparator implements Comparator<Integer> {
        public int compare(Integer a, Integer b) {
            return a*a - b*b;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int left = 0, right = n-1;
        while(left <= right) {
            if(arr[left] % 2 == 0) {
                left++;
            } else if(arr[right] == 1) {
                right--;
            } else {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++; right--;
            }
        }
        
        Arrays.sort(arr, 0,n/2);
        Arrays.sort(arr, n/2, n-1);
        for(int ele : arr) System.out.print(ele + " ");
    }
}