package Hacker_Rank;

import java.util.Scanner;

public class Tower_Breakers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0){
            int n = sc.nextInt();
            int m = sc.nextInt();

            if(n % 2 == 0){
                System.out.println(2);
            }
            else{
                if(m == 1){
                    System.out.println(2);
                }else
                    System.out.println(1);
            }
            t--;
        }
    }
}
