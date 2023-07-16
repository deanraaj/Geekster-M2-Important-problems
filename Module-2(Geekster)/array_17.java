// https://www.hackerrank.com/contests/ks-02-m2-java-dsa-class-challenges/challenges/print-first-vowel-occurance
import java.io.*;
import java.util.*;

public class array_17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] arr = new char[n];
        
        for(int i = 0; i < n; i++) {
            arr[i] = in.next().charAt(0);
        }
        
        for(int i = 0; i < n; i++) {
            char c = arr[i];
            if(c == 'a' || c=='e' || c=='i' || c=='o' || c=='u') {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}