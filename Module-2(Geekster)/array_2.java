import java.io.*;
import java.util.*;

public class array_2 {
    
    public static void solve(int[] arr, int n) {
        for(int i = 0; i < n; i=i+2) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            solve(arr,n);
        }
    }
}