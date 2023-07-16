import java.io.*;
import java.util.*;

public class array_3 {
    
    public static void solve(int[] arr, int n) {
        for(int i = n-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        solve(arr,n);
    }
}