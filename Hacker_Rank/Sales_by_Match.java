package Hacker_Rank;

import java.util.*;
import java.util.Scanner;

public class Sales_by_Match {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }//10 20 20 10 10 30 50 10 20
        Arrays.sort(arr);//10 10 10 10 20 20 20 30 50
        int count = 0;
        for (int i = 0; i+1 < n; i++){
            if (arr[i] == arr[i + 1]){
                count++;
                i++;
            }
        }
        System.out.println(count);

    }
}
