// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/sum-equals-one

import java.io.*;
import java.util.*;

public class array_49 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];
        for(int i=0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = i; j < n; j++) {
                int sum = 0;
                for(int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                }
                if(sum == 1) {
                    System.out.println(true);
                    return;
                }
            }
        }
        
        System.out.print(false);
    }
    
   
}