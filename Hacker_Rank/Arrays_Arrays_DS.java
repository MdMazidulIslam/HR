package Hacker_Rank;

import java.util.Scanner;

public class Arrays_Arrays_DS {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[n];
        for (int i = n-1; i >= 0; i--){
            arr1[i] = arr[n-(i+1)];
        }
        for (int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
