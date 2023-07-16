// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/calculator-36

import java.io.*;
import java.util.*;

public class array_31 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) arr[i] = in.nextInt();
        int x = in.nextInt();
      
        
        int idx = n-1;
        while(idx >= 0) {
            int sum = arr[idx] + x;
            arr[idx] = sum >= 10 ? sum%10 : sum;
            x = sum/10;
            idx--;
        }
        if(x != 0) {
            int[] res = new int[n+1];
            int j = 0;
            res[0] = x;
            for(int i = 1; i < n+1; i++) {
                res[i] = arr[j];
                j++;
            }
            for(int i = 0; i < res.length; i++) {
                System.out.print(res[i] + " ");
            }
            return;
        }
        
        for(int ele : arr) System.out.print(ele + " ");
    }
}