import java.io.*;
import java.util.*;

public class array_8 {
    
    public static void solve(int[] arr1, int n1) {
        
        for(int i = n1-1; i >= 0; i=i-2) {
            System.out.print(arr1[i] + " ");    
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int[] arr1 = new int[n1];
        for(int i = 0; i < n1; i++) {
            arr1[i] = in.nextInt();
        }
        
        
        solve(arr1, n1);
    }
}