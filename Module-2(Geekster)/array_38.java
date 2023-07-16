// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/mirror-image-4-1/

import java.io.*;
import java.util.*;

public class array_38 {

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
            for(int j = 0; j < n2; j++) {
                if(arr1[i] + arr2[j] == 0) {
                    System.out.print(arr1[i] + " ");
                }
            }
        }
        
    }
}