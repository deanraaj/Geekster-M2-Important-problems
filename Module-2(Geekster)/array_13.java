// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/find-an-element-1
import java.io.*;
import java.util.*;

public class array_13 {
    
    public static String checkEle(int[] arr, int n, int target) {
        
        for(int i = 0; i < n; i++) {
            if(arr[i] == target) return "True";    
        }
        return "False";
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
