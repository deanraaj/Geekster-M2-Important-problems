// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/duplicate-9

import java.io.*;
import java.util.*;

public class array_35 {

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
        
        for(int i = 0; i < n1; i++) {
            int ele = arr1[i];
            int c = 0;
            for(int j = 0; j < n2; j++) {
                if(arr2[j] == ele) {
                    c++;
                }
            }
            if(c == 2) {
                System.out.print(ele + " ");
            }
        }
        
    }
}