package Hacker_Rank;

import java.util.Scanner;

public class Drawing_Book {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int page = sc.nextInt();

        int mid = n /2;
        int count = 0;
        if (page <= mid){
            for (int i = 1; i < page; i++){
                count++;
                i++;
            }
        }else {
            for (int i = n; i > page; i--){
                i--;
                if (i >= page || n % 2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
