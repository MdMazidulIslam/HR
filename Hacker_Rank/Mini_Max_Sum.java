package Hacker_Rank;
import java.util.*;
public class Mini_Max_Sum {
    public static void minmax(int arr[],int minSum,int maxSum){
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr.length; j++){
                if (i == j){

                }else{
                    sum = sum + arr[j];
                }
            }

            if (sum > maxSum){
                maxSum = sum;
            }else {
                minSum = sum;
            }
        }
        System.out.println(minSum+" "+maxSum);
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] =new int [n];//7 69 2 221 8974
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        minmax(arr,0,0);
        //7 69 2 221 8974

    }
}
