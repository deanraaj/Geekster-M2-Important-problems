// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/gkstr44-bubble-sort

import java.io.*;
import java.util.*;

public class bubbleSort {
    public static void bubbleSort(int[] arr, int n) {
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        bubbleSort(arr, n);
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}