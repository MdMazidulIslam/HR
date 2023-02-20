package Hacker_Rank;

import java.util.Scanner;

public class Find_Digits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            int num = sc.nextInt();
            int x = num;

            int count = 0;
            int temp;
            while (num != 0){
                temp = num % 10;
                if(temp == 0){
//                    continue;
                }else if (x % temp ==0){
                    count++;
                }
                num = num / 10;
            }
            System.out.println(count);
        }
//        int[] arr = new int[];
    }
}
