package Hacker_Rank;

import java.util.Arrays;
import java.util.Scanner;

public class Birthday_Cake_Candles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int x = arr.length-1;
        int count = 1;
        while (arr[arr.length-1] == arr[x-1]){
            count++;
            x--;
            if(x == 0){
                break;
            }
        }
        System.out.println(count);
    }

}

