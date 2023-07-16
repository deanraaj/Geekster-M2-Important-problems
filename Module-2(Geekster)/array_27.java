// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/check-characterstic

import java.io.*;
import java.util.*;

public class array_27 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            if(arr[i] < 0) {
                arr[i] = -1;
            } else if(arr[i] > 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}