package Hacker_Rank;

import java.util.*;

public class Find_the_Median {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int mid = n / 2; //1 2 3 4 5 6 7 8
        System.out.println(arr[mid]);
    }
}
