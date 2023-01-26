package Hacker_Rank;
import java.util.*;
public class Diagonal_Difference {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int [n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int ltorSum = 0;
        int rtolSum = 0;

        for (int i = 0; i < arr.length;i++){
            for (int j = 0; j < arr.length;j++){
                if (i==j){
                    ltorSum += arr[i][j];
                }
            }
        }
        for (int i = 0; i < arr.length;i++){
            for (int j = arr.length-1; j >= 0;j--){
                if ((i+j) == n-1){
                    rtolSum+= arr[i][j];
                }
            }
        }
        int result = Math.abs(ltorSum-rtolSum);
        System.out.println(result);
    }
}
