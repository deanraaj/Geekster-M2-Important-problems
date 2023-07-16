// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/maximum-difference-between-the-two-elements

import java.io.*;
import java.util.*;

public class array_34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        int max = 0;
        for(int i = 0; i < n; i++) {
            for(int j = i +1; j < n; j++) {
                if(arr[i] < arr[j]) {
                    max = Math.max(max, (arr[j] - arr[i]));
                }
            }
        }
        
        System.out.println(max);
        
    }
}
    

