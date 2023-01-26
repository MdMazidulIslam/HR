package Hacker_Rank;
import java.util.*;
public class Subarray_Division_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;
        int sum = 0;
        for (int i = 0; i <= arr.length - m; i++){
            for (int j = i; j < i + m; j++){
                sum += arr[j];
            }
            if (sum == d){
                count++;
            }sum = 0;
        }
        System.out.println(count);
    }
}
