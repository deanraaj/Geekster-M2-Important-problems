// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/find-the-last-index-of-the-key
import java.io.*;
import java.util.*;

public class array_15 {
    
    public static int checkEle(int[] arr, int n, int target) {
        
        for(int i = n-1; i >= 0; i--) {
            if(arr[i] == target) return i;    
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        int target = in.nextInt();
        
        System.out.println(checkEle(arr, n, target));
    }
}