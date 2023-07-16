import java.io.*;
import java.util.*;

public class array_5 {
    
        public static boolean checkIdentical(int[] arr1, int n1, int[] arr2, int n2) {
        if(n1 != n2) return false;
        for(int i = 0; i < n1; i++) {
            if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

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
        
        System.out.println(checkIdentical(arr1, n1, arr2, n2));
    }
}