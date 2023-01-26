package Hacker_Rank;
import java.util.*;
public class Sparse_Arrays {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        String[] arr1 = new String[size1];
        for (int i = 0; i < arr1.length; i++){
            arr1[i] = sc.next();
        }
        int size2 = sc.nextInt();
        String[] arr2 = new String[size2];
        for (int i = 0; i < arr2.length; i++){
            arr2[i] = sc.next();
        }
        int[] arr = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            int count = 0;
            for (int j = 0; j < size1; j++){
                if (arr2[i].equals(arr1[j])){
                    count++;
                }
            }
            arr[i] = count;
        }
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
