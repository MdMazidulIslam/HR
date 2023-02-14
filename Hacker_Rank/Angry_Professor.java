package Hacker_Rank;

import java.util.Scanner;

public class Angry_Professor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int time =sc.nextInt();
        for (int j = 0; j < time; j++){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int k = sc.nextInt();
            int count = 0;
            int count1 = 0;
            for (int i = 0; i < n; i++){
                arr[i] = sc.nextInt();
                if (arr[i] <= 0){
                    count++;
//                    System.out.println("count ="+count);
                }else {
                    count1++;
//                    System.out.println("count1 ="+count1);
                }
            }
            if (count < k){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
