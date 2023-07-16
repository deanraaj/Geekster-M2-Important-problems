// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/remove-elements-1/

import java.io.*;
import java.util.*;

public class array_26 {
    
    public static int remove(int[] arr, int k) {
        int left = 0, right = arr.length - 1; 
        while(left <= right) {
            if(arr[left] != k) {
                left++;
            } else if(arr[right] == k) {
                right--;
            } else {
                int temp =arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == k) {
                break;
            } else {
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();
        
        int k = in.nextInt();
        
        System.out.println(remove(arr, k));
        
        
        
    }
}