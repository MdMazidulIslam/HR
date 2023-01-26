package Hacker_Rank;
import java.util.*;
public class Counting_Sort_1 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int [n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int [arr.length];

        for (int i = 0; i < arr1.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (i == arr[j]){
                    count++;
                }
            }
            arr1[i]=count;
        }
        for(int i = 0; i < arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
