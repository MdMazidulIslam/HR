package Hacker_Rank;

import java.util.Scanner;

public class Warmup_A_Very_Big_Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        long sum = 0;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextLong();
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
