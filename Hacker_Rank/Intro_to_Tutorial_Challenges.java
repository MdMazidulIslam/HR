package Hacker_Rank;

import java.util.Scanner;

public class Intro_to_Tutorial_Challenges {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        int index = 0;
        for (int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
            if (arr[i] == x){
                index = i;
            }
        }
        System.out.println(index);
    }
}
