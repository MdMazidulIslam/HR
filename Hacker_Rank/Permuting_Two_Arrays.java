package Hacker_Rank;
import java.util.*;
public class Permuting_Two_Arrays {
    public static String sol(int n, int[] arr, int[] arr1){
        for (int i = 0; i < arr.length; i++){
            int sum = arr[i] + arr1[i];
            if (sum < n){
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int j = 0; j < q; j++){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[n];
            for (int i = 0; i < arr.length; i++){
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length; i++){
                arr1[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            Arrays.sort(arr1);
            for (int i = 0; i < arr.length/2; i++){
                int temp = arr1[i];
                arr1[i] = arr1[n-1];
                arr1[n-1] = temp;
                n--;
            }
            String result = sol(k,arr,arr1);
            System.out.println(result);

        }
    }
}
