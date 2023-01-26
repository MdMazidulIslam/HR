package Hacker_Rank;
import java.util.Scanner;
public class Lonely_Integer {
    public static void uniq(int arr[]){

        for(int i = 0; i < arr.length; i++){
            int count = 0;
            for (int j = 0; j < arr.length; j++){
                if (i != j && arr[i]==arr[j]){
                    count++;
                }
            }
            if (count == 0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        uniq(arr);
    }
}
