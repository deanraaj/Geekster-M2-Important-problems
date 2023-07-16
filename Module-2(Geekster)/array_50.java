// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/gkstr32-reverse-array

import java.io.*;
import java.util.*;

public class array_50 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        int left = 0, right = n-1;
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        
        for(int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
    
   
}