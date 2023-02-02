package Hacker_Rank;

import java.util.Scanner;

public class Arrays_Left_Rotation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < r; i++){// 1 2 3 4 5
            int temp = arr[0];
            for (int j = 0; j < n-1; j++){
                arr[j] = arr[j+1];// 2 3 4 5
            }
            arr[arr.length-1] = temp;// 2 3 4 5 1
        }
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
