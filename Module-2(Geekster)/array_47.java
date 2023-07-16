// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/max-subarray-2-1

import java.util.*;

public class array_47 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i= 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        System.out.print(max);
    }
}